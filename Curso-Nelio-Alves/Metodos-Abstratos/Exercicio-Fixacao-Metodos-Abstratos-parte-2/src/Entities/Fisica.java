package Entities;

public class Fisica extends Taxa{

    private double gastosSaude;

    public Fisica(String nome, double salarioAnual, double gastosSaude) {
        super(nome, salarioAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double taxa() {
        double soma;
        if (this.getSalarioAnual() <= 20000){
            soma = this.getSalarioAnual() * ((double) 15 /100);
        } else {
            soma = this.getSalarioAnual() * ((double) 25 /100);
        }

        if (this.gastosSaude > 0){
            soma = soma - (this.gastosSaude * ((double) 50/100));
        }

        return soma;
    }


}
