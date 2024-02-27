package com.example.convertidorgrados.models;

public class Fahrenheit extends Grado
{
    public Fahrenheit(double valor)
    {
        this.setSimbolo("F");
        this.setValor(valor);
    }

    public Fahrenheit parse(Celsius c)
    {
        return new Fahrenheit((c.getValor() - 32) * 5 / 9);
    }

    public Fahrenheit parse(Kelvin k)
    {
        return new Fahrenheit((k.getValor() - 32) * 5 / 9 + 273.15);
    }
}
