import Entities.Dados;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos descobrir quando de impostos você irá pagar (Baseado nas taxas Holandesas)");
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu salario (anual): ");
        int salario = sc.nextInt();

        Dados dados = new Dados(nome, idade, salario);

        double soma = 0.0;
        if (dados.getSalario() > 68508){
            soma = dados.getSalario() * (49.5/100);
        } else if (dados.getSalario() > 34712 && dados.getSalario() < 68507){
            soma = dados.getSalario() * (37.35/100);
        } else if (dados.getSalario() < 34712) {
            soma = dados.getSalario() * (9.7/100);
        }

        System.out.println("Prezado "+ dados.getNome() + ", informamos que o total de imposto a ser pago é = " + soma + " Euros");

        sc.close();
    }
}