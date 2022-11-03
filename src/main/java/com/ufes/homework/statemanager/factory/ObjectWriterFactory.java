package com.ufes.homework.statemanager.factory;

import com.ufes.homework.statemanager.log.adapter.ILogAdapter;
import com.ufes.homework.statemanager.log.adapter.JSONLogAdapter;

public class ObjectWriterFactory implements IWriterFactory{

    @Override
    public ILogAdapter getEscritor(String fileName) {
        return new JSONLogAdapter(fileName);
    }
}
