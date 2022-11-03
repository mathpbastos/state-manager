package com.ufes.homework.statemanager.factory;

import com.ufes.homework.statemanager.log.adapter.CSVLogAdapter;
import com.ufes.homework.statemanager.log.adapter.ILogAdapter;

public class CSVWriterFactory implements IWriterFactory{

    @Override
    public ILogAdapter getEscritor(String fileName) {
        return new CSVLogAdapter(fileName);
    }
}
