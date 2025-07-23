package Entities;

import EntitiesEnum.Color;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    public Retangulo(Color color, double largura, double altura) {
        super(String.valueOf(color));
        this.altura = altura;
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return altura * largura;
    }
}

