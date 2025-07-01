public class Main {
    public static void main(String[] args) {
        Livro liv = new Livro();

        liv.titulo = "A Sutil arte de ligar o FODA SE";
        liv.paginas = 130;
        liv.fechar();
        liv.status();
        liv.ler();

        System.out.println(" ");

        Livro liv2 = new Livro();

        liv2.titulo = "Psicologia financeira";
        liv2.paginas = 200;
        liv2.abrir();
        liv2.status();
        liv2.ler();

        System.out.println(" ");

        Livro liv3 = new Livro();

        liv3.titulo = "Entendendo algoritmos";
        liv3.paginas = 140;
        liv3.abrir();
        liv3.status();
        liv3.ler();
    }
}