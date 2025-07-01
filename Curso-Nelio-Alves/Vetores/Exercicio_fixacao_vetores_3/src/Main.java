import entities.Pessoas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar: ");
        int n = sc.nextInt();
        Pessoas[] vetor = new Pessoas[n];

        for (int i=0; i<n; i++){
            System.out.printf("Dados da %dª pessoa:\n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new Pessoas(nome, idade, altura);
        }

        System.out.println(" ");

        int menores = 0;
        double altura_total = 0.0;
        for (int i=0; i<n; i++){
            if (vetor[i].getIdade() < 16){
                menores++;
            }
            altura_total += vetor[i].getAltura();
        }

        double altura_media = altura_total / n;
        double porcentagem_Menores = ((double)menores / n) * 100;

        System.out.printf("\nAltura media = %.2f\n", altura_media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem_Menores);

        for (int i=0; i<n; i++){
            if (vetor[i].getIdade() < 16){
                System.out.println(vetor[i].getNome());
            }
        }
        sc.close();
    }
}