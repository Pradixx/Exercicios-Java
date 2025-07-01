public class Main {
    public static void main(String[] args) {
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        l.emitirSom();
        c.emitirSom();

        c.reagir("Olá");
        c.reagir("Vou te bater");

        c.reagir(10, 45);
        c.reagir(22, 11);
        c.reagir(3, 4.0f);
        c.reagir(true);
        c.reagir(false);


        System.out.println(c.toString());

    }
}