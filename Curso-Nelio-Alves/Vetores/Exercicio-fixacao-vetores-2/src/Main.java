import entities.Numeros;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar: ");
        int n = sc.nextInt();
        Numeros[] vetor = new Numeros[n];

        System.out.println("Digite os numeros: ");
        for (int i=0; i<n; i++){
            int num = sc.nextInt();
            vetor[i] = new Numeros(num);
        }

        System.out.print("Valores: ");
        for (int i=0; i<n; i++){
            System.out.print(vetor[i].getNum() + " ");
        }

        int soma = 0;
        for (int i=0; i<n; i++){
            soma += vetor[i].getNum();
        }

        double media = soma / n;

        System.out.println(" ");

        System.out.println("Soma: " + soma);
        System.out.println("Media " + media);
    }
}