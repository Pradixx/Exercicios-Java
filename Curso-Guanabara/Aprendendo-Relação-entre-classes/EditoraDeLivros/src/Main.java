public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Paulo", 22, "M");
        p[1] = new Pessoa("Jonas", 30, "m");

        l[0] = new Livro("Java", "Leo", 200, p[0]);
        l[1] = new Livro("Python", "Joao", 300, p[1]);
        l[2] = new Livro("Kotlin", "Papi", 500, p[0]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}