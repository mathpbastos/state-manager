package com.ufes.homework.statemanager.model;

import com.ufes.homework.statemanager.state.PortaState;
import com.ufes.homework.statemanager.state.TrancadaState;

import java.io.IOException;

public class Porta {

    private boolean aberta;
    private boolean fechada;
    private PortaState estado;

    public Porta(){
        this.aberta = false;
        this.fechada = true;
        this.estado = new TrancadaState(this);
    }

    public void destrancar() throws IOException {
        this.estado.destrancar();
    }

    public void trancar() throws IOException{
        this.estado.trancar();
    }

    public void fechar() throws IOException{
        this.estado.fechar();
    }

    public void abrir() throws IOException{
        this.estado.abrir();
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public boolean isFechada() {
        return fechada;
    }

    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }

    public PortaState getEstado() {
        return estado;
    }

    public void setEstado(PortaState estado) {
        this.estado = estado;
    }
}
