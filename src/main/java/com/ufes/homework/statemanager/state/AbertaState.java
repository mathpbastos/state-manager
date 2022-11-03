package com.ufes.homework.statemanager.state;

import com.ufes.homework.statemanager.model.Porta;
import com.ufes.homework.statemanager.model.RegistroLog;

import java.io.IOException;

public class AbertaState extends PortaState{

    public AbertaState(Porta porta){
        super(porta);
        this.porta.setAberta(true);
        this.porta.setFechada(false);
    }

    @Override
    public void destrancar() {
        throw new RuntimeException("Não é possível destrancar uma porta aberta");
    }

    @Override
    public void trancar() {
        throw new RuntimeException("Antes de trancar, deve-se fechar a porta.");
    }

    @Override
    public void abrir() {
        throw new RuntimeException("Porta já aberta.");
    }

    @Override
    public void fechar() throws IOException{
        RegistroLog registerLog = new RegistroLog(
                "Alteração de estado",
                "A porta foi trancada",
                "ABERTA_STATE_FECHAR"
        );
        metodoLog.escreve(registerLog);
        this.porta.setEstado(new FechadaState(this.porta));
    }
}
