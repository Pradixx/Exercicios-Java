public class Ave extends Animal{
    private String corPena;

    public void locomover(){
        System.out.println("Voando");
    }

    public void alimentar(){
        System.out.println("Comendo inseto");
    }

    public void emitirSom(){
        System.out.println("Som de ave");
    }

    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
