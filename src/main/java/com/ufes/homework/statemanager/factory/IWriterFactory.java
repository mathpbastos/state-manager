package com.ufes.homework.statemanager.factory;

import com.ufes.homework.statemanager.log.adapter.ILogAdapter;

public interface IWriterFactory {

    ILogAdapter getEscritor(String fileName);

}
