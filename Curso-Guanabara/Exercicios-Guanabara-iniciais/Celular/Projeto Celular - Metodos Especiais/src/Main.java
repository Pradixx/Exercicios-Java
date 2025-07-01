public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular("Apple", "Preto", "Iphone 11");

        cel.desligar();
        cel.encherCarga();

        cel.status();
        cel.tirarFoto();

        System.out.println(" ");

        Celular cel2 = new Celular("Samsung", "Branco", "S24 +");

        cel2.ligar();
        cel2.encherCarga();

        cel2.status();
        cel2.tirarFoto();
    }
}