package com.example.convertidorgrados.models;

public class Grado implements iGrado
{

    private String simbolo = null;

    public Double valor = null;

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
