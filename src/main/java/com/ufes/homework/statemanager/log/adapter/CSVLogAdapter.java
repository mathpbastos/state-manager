package com.ufes.homework.statemanager.log.adapter;

import com.ufes.homework.statemanager.log.adaptado.CSVWriter;
import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.IOException;

public class CSVLogAdapter extends ILogAdapter{

    private CSVWriter csvWriter;

    public CSVLogAdapter(String fileName) {
        super(fileName);
        this.csvWriter = new CSVWriter(fileName);
    }

    @Override
    public void escreve(RegistroLog registerLog) throws IOException {
        csvWriter.escrever(registerLog);
    }
}