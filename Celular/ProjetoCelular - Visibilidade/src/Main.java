public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular();

        cel.marca = "Apple";
        cel.modelo = "Iphone 11";
        cel.cor = "Preto";
        cel.desligar();
        cel.encherCarga();

        cel.status();
        cel.tirarFoto();

        System.out.println(" ");

        Celular cel2 = new Celular();

        cel2.marca = "Samsung";
        cel2.modelo = "S24 +";
        cel2.cor = "Branco";
        cel2.ligar();
        cel2.encherCarga();

        cel2.status();
        cel2.tirarFoto();
    }
}