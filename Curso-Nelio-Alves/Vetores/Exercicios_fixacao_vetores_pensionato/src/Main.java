import entities.Pensionista;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos deseja alugar: ");
        int n = sc.nextInt();
        Pensionista[] vetor = new Pensionista[10];

        for (int i=1; i<=n; i++){
            System.out.printf("Aluguel #%d\n", i);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vetor[quarto] = new Pensionista(nome, email, quarto);
        }

        System.out.println(" ");

        for (int i=0; i<10; i++){
            if (vetor[i] != null){
                System.out.printf("Quarto %d: %s, %s\n", vetor[i].getRoom(), vetor[i].getNome(),vetor[i].getEmail());
            }
        }
        sc.close();
    }
}