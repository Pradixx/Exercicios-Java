package Entities;

public class Arqueiro extends Personagem{

    public Arqueiro(String nome, String tipo, int energia) {
        super(nome, tipo, energia);
    }


    @Override
    public void usarHabilidade() {
        this.setEnergia(this.getEnergia() - 20);
    }
}
