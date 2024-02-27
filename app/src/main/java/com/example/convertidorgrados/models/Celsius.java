package com.example.convertidorgrados.models;

public class Celsius extends Grado
{
    public Celsius(double valor)
    {
        this.setSimbolo("C");
        this.setValor(valor);
    }

    public  Celsius parse(Fahrenheit f)
    {
        return new Celsius((f.getValor() - 32) * 5 / 9);
    }

    public  Celsius parse(Kelvin k)
    {
        return new Celsius(k.getValor() - 273.15);
    }
}
