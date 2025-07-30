import Entities.Conta;

import java.util.Scanner;
import Exception.DomainException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta:");

        System.out.print("Numero da conta:");
        int numero = sc.nextInt();

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        double limiteSaque = 300;

        Conta conta = new Conta(numero, nome, saldo, limiteSaque);

        System.out.println();
        System.out.println(conta);
        System.out.println();

        System.out.print("Deseja efetuar um saque ou deposito (s/d)? ");
        char ch = sc.next().charAt(0);

        try {
            if (ch == 's') {
                System.out.print("Digite o valor do saque: ");
                double montante = sc.nextDouble();

                conta.saque(montante);

                System.out.println();
                System.out.println(conta);

            } else if (ch == 'd') {
                System.out.print("Digite o valor do deposito: ");
                double montante = sc.nextDouble();

                conta.deposito(montante);

                System.out.println();
                System.out.println(conta);
            }
        }
        catch (DomainException e){
            System.out.println();
            System.out.println("Erro: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println();
            System.out.println("Erro Inexperado.");
        }

        sc.close();
    }
}