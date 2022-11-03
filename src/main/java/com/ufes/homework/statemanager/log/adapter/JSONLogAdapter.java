package com.ufes.homework.statemanager.log.adapter;

import com.ufes.homework.statemanager.log.adaptado.ObjectWriter;
import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.IOException;

public class JSONLogAdapter extends ILogAdapter{

    ObjectWriter writer;

    public JSONLogAdapter(String fileName) {
        super(fileName);
        this.writer = new ObjectWriter(fileName);
    }

    @Override
    public void escreve(RegistroLog registerLog) throws IOException {
        writer.escrever(registerLog);
    }
}
