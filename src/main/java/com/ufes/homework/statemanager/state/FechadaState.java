package com.ufes.homework.statemanager.state;

import com.ufes.homework.statemanager.model.Porta;
import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.IOException;

public class FechadaState extends PortaState {

    public FechadaState(Porta porta){
        super(porta);
        this.porta.setAberta(false);
        this.porta.setFechada(true);
    }

    @Override
    public void destrancar() {
        throw new RuntimeException("Porta já destrancada.");
    }

    @Override
    public void trancar() throws IOException{
        RegistroLog registerLog = new RegistroLog(
                "Alteração de estado",
                "A porta foi trancada",
                "FECHADA_STATE_TRANCAR"
        );
        metodoLog.escreve(registerLog);
        this.porta.setEstado(new TrancadaState(this.porta));
    }

    @Override
    public void abrir() throws IOException{
        RegistroLog registerLog = new RegistroLog(
                "Alteração de estado",
                "A porta foi aberta",
                "FECHADA_STATE_ABRIR"
        );
        metodoLog.escreve(registerLog);
        this.porta.setEstado(new AbertaState(this.porta));
    }

    @Override
    public void fechar() {
        throw new RuntimeException("Porta já fechada.");
    }
}
