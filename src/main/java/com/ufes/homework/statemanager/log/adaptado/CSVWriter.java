package com.ufes.homework.statemanager.log.adaptado;

import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    File file;

    public CSVWriter(String fileName) {
        file = new File(fileName+".csv");
    }

    public void escrever(RegistroLog log) throws IOException {
        FileWriter outputFile = new FileWriter(file, true);
        com.opencsv.CSVWriter csvWriter = new com.opencsv.CSVWriter(outputFile);

        String[] logData = {
                log.getTipo(),
                log.getInformacao(),
                log.getUsuario(),
                log.getDataHora().toString()
        };

        csvWriter.writeNext(logData);
        csvWriter.close();

    }

}
