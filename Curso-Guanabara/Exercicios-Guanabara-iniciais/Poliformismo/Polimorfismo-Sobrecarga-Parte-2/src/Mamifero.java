public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void emitirSom(){
        System.out.println("Som Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
