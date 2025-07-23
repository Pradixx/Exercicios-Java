package Entities;

public abstract class Taxa {

    private String nome;
    private double salarioAnual;

    public Taxa(String nome, double salarioAnual) {
        this.nome = nome;
        this.salarioAnual = salarioAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public abstract double taxa();
}
