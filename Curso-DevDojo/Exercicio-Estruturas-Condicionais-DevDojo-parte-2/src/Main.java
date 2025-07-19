import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de 1 a 7 para descobrir se é dia útil da semana: ");
        int num = sc.nextInt();

        System.out.println();

        switch (num){
            case 1:
                System.out.println("Hoje é domingo, Final de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda, vai trabalhar");
                break;
            case 3:
                System.out.println("Hoje é terça, a semana ainda ta longe de acabar");
                break;
            case 4:
                System.out.println("Hoje é quarta, ainda é dia de trabalhar");
                break;
            case 5:
                System.out.println("Hoje é quinta, ta quase acabando");
                break;
            case 6:
                System.out.println("Hoje é sexta, sextou meu nobre");
                break;
            case 7:
                System.out.println("Hoje é sabado, pode dormi até mais tarde");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        sc.close();
    }
}