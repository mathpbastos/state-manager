package com.ufes.homework.statemanager.model;

import java.time.LocalDateTime;

public class RegistroLog {
    String tipo;
    String informacao;
    String usuario;
    LocalDateTime dataHora;

    public RegistroLog(){}

    public RegistroLog(String tipo, String informacao, String usuario) {
        this.tipo = tipo;
        this.informacao = informacao;
        this.usuario = usuario;
        this.dataHora = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public String getInformacao() {
        return informacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
