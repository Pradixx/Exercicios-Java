public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(5.3f);
        m.setIdade(7);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c.setPeso(25.3f);
        c.setIdade(17);
        c.setMembros(14);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(5.3f);
        k.setIdade(7);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();

        r.setPeso(55.3f);
        r.setIdade(23);
        r.setMembros(2);
        r.locomover();
        r.alimentar();
        r.emitirSom();

        p.setPeso(25.3f);
        p.setIdade(2);
        p.setMembros(10);
        p.locomover();
        p.alimentar();
        p.emitirSom();

        a.setPeso(2.3f);
        a.setIdade(4);
        a.setMembros(1);
        a.locomover();
        a.alimentar();
        a.emitirSom();

        System.out.println(m.toString());

    }
}