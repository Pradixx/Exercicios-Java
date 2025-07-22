import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Para começar coloque seu nome: ");
        String nome = sc.next();
        System.out.print("Digite o endereco: ");
        sc.nextLine();
        String endereco = sc.nextLine();
        System.out.print("Digite o salario: ");
        int salario = sc.nextInt();
        Date data = new Date();

        Dados dados = new Dados(nome, endereco, salario, data);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println();
        System.out.println("Eu " + dados.getNome() + ", morando no endereço "+ dados.getEndereco() + ", confirmo que recebi o salário de " + dados.getSalario() + ", na data " + dataFormatada.format(dados.getData()));


        sc.close();
    }
}