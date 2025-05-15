import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calculo;
        int num1;
        int num2;
        double res;

        System.out.println("Bem-vindo a calculadora de terminal");
        System.out.println("Para começar vamos confirmar que tipo de calculo você deseja fazer");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Exponenciação");
        System.out.println("6- Raiz quadrada");
        System.out.print("Digite a sua opção: ");
        calculo = sc.nextInt();

        System.out.printf("%n");

        switch (calculo) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextInt();
                System.out.print("Digite o primeiro número: ");
                num2 = sc.nextInt();

                res = num1 + num2;

                System.out.printf("Resultado: %f%n", res);
                break;

            case 2:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextInt();
                System.out.print("Digite o primeiro número: ");
                num2 = sc.nextInt();

                res = num1 - num2;

                System.out.printf("Resultado: %f%n", res);
                break;

            case 3:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextInt();
                System.out.print("Digite o primeiro número: ");
                num2 = sc.nextInt();

                res = num1 * num2;

                System.out.printf("Resultado: %.2f%n", res);
                break;

            case 4:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextInt();
                System.out.print("Digite o primeiro número: ");
                num2 = sc.nextInt();

                res = (double) num1 / num2;

                System.out.printf("Resultado: %.2f%n", res);
                break;

            case 5:
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextInt();
                System.out.print("Digite o primeiro número: ");
                num2 = sc.nextInt();

                res = Math.pow(num1, num2);

                System.out.printf("Resultado: %.2f%n", res);
                break;

            case 6:
                System.out.print("Digite o número: ");
                num1 = sc.nextInt();


                res = Math.sqrt(num1);

                System.out.printf("Resultado: %.2f%n", res);
                break;

        }
        sc.close();
        }
    }
