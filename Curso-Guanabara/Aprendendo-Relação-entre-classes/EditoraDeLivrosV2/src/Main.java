public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Autor[] a = new Autor[1];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Leo", 22, "M");
        p[1] = new Pessoa("Maria", 18, "F");

        a[0] = new Autor("Valmir", 70, 5);

        l[0] = new Livro("Java", a[0], 200, p[0]);
        l[1] = new Livro("POO", a[0], 150, p[1]);
        l[2] = new Livro("Python", a[0], 220, p[1]);


        l[0].abrir();
        l[0].folhear(50);

        l[1].folhear(70);
        l[1].avancarPag();

        l[2].abrir();
        l[2].folhear(300);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());

    }
}