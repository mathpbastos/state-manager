package com.ufes.homework.statemanager.log.adaptado;

import com.google.gson.Gson;
import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ObjectWriter {

    File file;

    public ObjectWriter(String fileName){
        file = new File(fileName+".json");
    }

    public void escrever(RegistroLog log) throws IOException {
        Gson gson = new Gson();

        String jsonLog = gson.toJson(log);
        System.out.println(jsonLog);

        FileWriter outputFile = new FileWriter(file, true);

        BufferedWriter bf = new BufferedWriter(outputFile);
        bf.newLine();
        bf.write(jsonLog);
        bf.close();
    }

}
