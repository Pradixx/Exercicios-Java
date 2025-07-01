public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Renovou bolsa " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " É bolsista");
    }


    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
