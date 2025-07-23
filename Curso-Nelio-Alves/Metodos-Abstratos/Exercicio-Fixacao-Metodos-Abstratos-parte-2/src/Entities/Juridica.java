package Entities;

public class Juridica extends Taxa{

    private int numeroFuncionarios;

    public Juridica(String nome, double salarioAnual, int numeroFuncionarios) {
        super(nome, salarioAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxa() {
        double soma;
        if (this.getNumeroFuncionarios() >= 10){
            soma = this.getSalarioAnual() * ((double) 14 /100);
        } else {
            soma = this.getSalarioAnual() * ((double) 16 /100);
        }

        return soma;
    }
}
