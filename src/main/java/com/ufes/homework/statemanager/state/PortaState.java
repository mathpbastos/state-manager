package com.ufes.homework.statemanager.state;

import com.ufes.homework.statemanager.log.adapter.ILogAdapter;
import com.ufes.homework.statemanager.model.Porta;

import java.io.IOException;

public abstract class PortaState {

    protected Porta porta;
    protected static ILogAdapter metodoLog;

    public PortaState(Porta porta){
        this.porta = porta;
    }

    public final void setMetodoLog(ILogAdapter adapter){
        metodoLog = adapter;
    }
    public abstract void destrancar() throws IOException;
    public abstract void trancar() throws IOException;
    public abstract void abrir() throws IOException;
    public abstract void fechar() throws IOException;
}
