package com.ufes.homework.statemanager.log.adapter;

import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.IOException;

public abstract class ILogAdapter {
    public ILogAdapter(String fileName){}

    public abstract void escreve(RegistroLog registerLog) throws IOException;
}
