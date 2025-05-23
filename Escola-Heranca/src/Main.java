public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Jonas");
        p2.setNome("Claudia");
        p3.setNome("Mario");
        p4.setNome("Karmem");

        p2.setCurso("Tecnologia da Informação");
        p3.setSalario(4000.90f);
        p4.setSetor("Recepcionista");

        p2.cancelarMatr();
        p3.receberAum();
        p4.mudarTrabalho();

        System.out.println(p1.exibirDetalhes());
        System.out.println(p2.exibirDetalhes());
        System.out.println(p3.exibirDetalhes());
        System.out.println(p4.exibirDetalhes());
    }
}