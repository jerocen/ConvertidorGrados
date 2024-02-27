package com.example.convertidorgrados.models;

public class Kelvin extends Grado
{
    public Kelvin(double valor)
    {
        this.setSimbolo("K");
        this.setValor(valor);
    }

    public Kelvin parse(Fahrenheit f)
    {
        return  new Kelvin((f.getValor() + 459.67) * 5/9);
    }

    public Kelvin parse(Celsius c)
    {
        return new Kelvin(c.getValor()+ 273.15);
    }
}
