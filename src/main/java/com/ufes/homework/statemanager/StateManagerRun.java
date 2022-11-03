package com.ufes.homework.statemanager;

import com.ufes.homework.statemanager.factory.CSVWriterFactory;
import com.ufes.homework.statemanager.model.Porta;

import java.io.IOException;

public class StateManagerRun {
    public static void main(String[] args) throws IOException {
        Porta p = new Porta();
        p.getEstado().setMetodoLog(new CSVWriterFactory().getEscritor("log"));

        p.destrancar();
        p.trancar();
        p.destrancar();
        p.abrir();
        p.fechar();
        p.trancar();
    }
}
