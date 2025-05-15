import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha;
        double celsius;
        double fahren;
        double kelvin;
        double res;

        System.out.println("Bem-vindo ao conversor de temperatura");
        System.out.println("Para começar vamos confirmar que tipo de conversão você deseja fazer");
        System.out.println("1- Celsius para Kelvin");
        System.out.println("2- Celsius para Fahrenheit");
        System.out.println("3- Kelvin para Fahrenheit");
        System.out.println("4- Kelvin para Celsius");
        System.out.println("5- Fahrenheit para Kelvin");
        System.out.println("6- Fahrenheit para Celsius");
        System.out.print("Digite a sua opção: ");
        escolha = sc.nextInt();

        System.out.printf("%n");

        switch (escolha){
            case 1:
                System.out.print("Digite o valor em Celsius: ");
                celsius = sc.nextDouble();

                res = celsius + 273.15;

                System.out.printf("Resultado: %.1f ºK %n", res);
                break;

            case 2:
                System.out.print("Digite o valor em Celsius: ");
                celsius = sc.nextDouble();

                res = (celsius * 1.8) + 32;

                System.out.printf("Resultado: %.1f ºF %n", res);
                break;

            case 3:
                System.out.print("Digite o valor em Kelvin: ");
                kelvin = sc.nextDouble();

                res = (kelvin - 273.15) * 1.8 + 32;

                System.out.printf("Resultado: %.1f ºF %n", res);
                break;

            case 4:
                System.out.print("Digite o valor em Kelvin: ");
                kelvin = sc.nextDouble();

                res = kelvin - 273.15;

                System.out.printf("Resultado: %.1f ºC %n", res);
                break;

            case 5:
                System.out.print("Digite o valor em Fahrenheit: ");
                fahren = sc.nextDouble();

                res = (fahren - 32) * 1.8 + 273.15;

                System.out.printf("Resultado: %.1f ºK %n", res);
                break;

            case 6:
                System.out.print("Digite o valor em Fahrenheit: ");
                fahren = sc.nextDouble();

                res = (fahren - 32) / 1.8;

                System.out.printf("Resultado: %.1f ºC %n", res);
                break;
        }

        sc.close();
        }
    }
