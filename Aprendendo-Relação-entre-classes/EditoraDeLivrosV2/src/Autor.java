public class Autor {
    private String nome;
    private int idade;
    private int bestSellers;

    public void autorFamoso(){
        if (bestSellers > 4){
            System.out.println("O " + getNome() + " é um grande escritor");
        } else {
            System.out.println("O " + getNome() + "Ainda não alcancou o seu apice");
        }
    }

    public Autor(String nome, int idade, int bestSellers) {
        this.nome = nome;
        this.idade = idade;
        this.bestSellers = bestSellers;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getBestSellers() {
        return bestSellers;
    }

    public void setBestSellers(int bestSellers) {
        this.bestSellers = bestSellers;
    }
}
