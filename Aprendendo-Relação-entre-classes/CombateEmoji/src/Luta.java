import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor){
                case 0: //empate
                    System.out.println("Empate");
                    desafiado.empatarLuta();
                    desafiantempatarLuta();
                    break;
                case 1: //ganhar desafiado
                    System.out.println(desafiado.getNome() + " GANHOU!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //perder desafiante
                    System.out.println(desafiante.getNome() + " GANHOU!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
