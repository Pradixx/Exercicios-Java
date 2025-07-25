package Entities;

public class Carro {

    private String nome;
    private String modelo;
    private String marca;
    private int ano;


    public Carro(String nome, String modelo, String marca, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
