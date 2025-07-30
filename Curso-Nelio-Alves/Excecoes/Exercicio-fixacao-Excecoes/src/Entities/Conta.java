package Entities;

import Exception.DomainException;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limiteSaque;

    public Conta(int numero, String nome, double saldo, double limiteSaque) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double deposito(double montante){
        if (montante <= 0){
            throw new DomainException("Impossivel depositar saldo negativo ou nada.");
        }
        return getSaldo() + montante;
    }

    public double saque(double montante) throws DomainException{
        if (this.getLimiteSaque() < montante){
            throw new DomainException("Saque maior que o limite");
        }
        if (this.getSaldo() < montante) {
            throw new DomainException("Saque mais que o saldo.");
        }
        return getSaldo() - montante;
    }

    @Override
    public String toString() {
        return "## Dados da conta ##" +
                "\nNumero = " + numero +
                "\nNome = " + nome +
                "\nSaldo = " + saldo +
                "\nLimite de Saque = " + limiteSaque;
    }
}
