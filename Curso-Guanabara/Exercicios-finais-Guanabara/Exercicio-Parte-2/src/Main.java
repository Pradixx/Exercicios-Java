public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vis[] = new Visualizacao[2];

        v[0] = new Video("Aula 14 POO");
        v[1] = new Video("Aula 8 POO");

        g[0] = new Gafanhoto("Jonas", 17, "M", "Jonasx17");
        g[1] = new Gafanhoto("Maria", 16, "F", "Mariax16");

        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(75.5f);
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[1], v[0]);
        vis[1].avaliar();
        System.out.println(vis[1].toString());



        /*System.out.println(v[0].toString());
        System.out.println(v[1].toString());

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}