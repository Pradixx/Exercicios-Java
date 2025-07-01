import java.util.Scanner;
import entities.Numeros;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar: ");
        int n = sc.nextInt();

        Numeros[] vetor = new Numeros[n];

        for (int i=0; i<n; i++){
            int num = sc.nextInt();
            vetor[i] = new Numeros(num);
        }

        System.out.println(" ");
        System.out.println("Numeros negativos: ");

        for (int i=0; i<n; i++){
            if (vetor[i].getNum() < 0) {
                System.out.println(vetor[i].getNum());
            }
        }



        sc.close();
    }
}