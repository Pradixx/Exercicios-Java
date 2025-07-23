package Entities;

import EntitiesEnum.Color;

public class Circulo extends Forma{

    private double raio;
    private double pi = 3.14;

    public Circulo(Color color, double raio) {
        super(String.valueOf(color));
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double area() {
        return pi * (raio * raio);
    }
}
