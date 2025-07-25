package Entities;

public abstract class Personagem {

    private String tipo;
    private String nome;
    private int energia;

    public Personagem(String nome, String tipo, int energia) {
        this.nome = nome;
        this.energia = energia;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void usarHabilidade();

    public String exibirStatus(){
        return "Nome: " + this.getNome() + "Tipo: " + this.getTipo() +" - Energia: " + this.getEnergia();
    }
}
