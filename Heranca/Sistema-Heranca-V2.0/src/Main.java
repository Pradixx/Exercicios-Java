public class Main {
    public static void main(String[] args) {

        Aluno p2 = new Aluno();
        Bolsista b1 = new Bolsista();


        p2.setCurso("Tecnologia da Informação");
        p2.setNome("Jonas");
        p2.pagarMensalidade();

        b1.setNome("Aldeido");
        b1.pagarMensalidade();
        b1.renovarBolsa();

        System.out.println(p2.toString());
        System.out.println(b1.toString());;
    }
}