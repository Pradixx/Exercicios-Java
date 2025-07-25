package Entities;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, String tipo, int energia) {
        super(nome, tipo, energia);
    }

    @Override
    public void usarHabilidade() {
        this.setEnergia(this.getEnergia() - 10);
    }
}
