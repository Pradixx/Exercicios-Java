public class Livro {
    String titulo;
    int paginas;
    boolean abrindo;

    void status(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("O livro está aberto? " + this.abrindo);
    }

    void abrir(){
        this.abrindo = true;
    }
    void fechar(){
        this.abrindo = false;
    }
    void ler(){
        if (this.paginas >= 150){
            System.out.println("Seloco, não compensa");
        } else if (this.abrindo == true) {
            System.out.println("Partiu leitura");
        } else {
            System.out.println("Infelizmente não vai ter como");
        }
    }
}
