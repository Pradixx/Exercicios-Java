package Entities;

public class Mago extends Personagem{

    public Mago(String nome, String tipo, int energia) {
        super(nome, tipo, energia);
}

    @Override
    public void usarHabilidade() {
        this.setEnergia(this.getEnergia() - 15);
    }
}
