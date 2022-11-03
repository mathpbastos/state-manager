package com.ufes.homework.statemanager.state;

import com.ufes.homework.statemanager.model.Porta;
import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.IOException;

public class TrancadaState extends PortaState{

    public TrancadaState(Porta porta){
        super(porta);
        this.porta.setAberta(false);
        this.porta.setFechada(true);
    }

    @Override
    public void destrancar() throws IOException{
        RegistroLog registerLog = new RegistroLog(
                "Alteração de estado",
                "A porta foi destrancada",
                "TRANCADA_STATE_DESTRANCAR"
        );
        metodoLog.escreve(registerLog);
        this.porta.setEstado(new FechadaState(this.porta));
    }

    @Override
    public void trancar() {
        throw new RuntimeException("Porta já trancada");
    }

    @Override
    public void abrir() {
        throw new RuntimeException("Não é possível abrir uma porta trancada.");

    }

    @Override
    public void fechar() {
        throw new RuntimeException("Porta já fechada.");
    }
}
