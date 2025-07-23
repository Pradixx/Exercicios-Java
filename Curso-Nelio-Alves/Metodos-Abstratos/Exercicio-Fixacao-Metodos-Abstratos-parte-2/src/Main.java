import Entities.Fisica;
import Entities.Juridica;
import Entities.Taxa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int num = sc.nextInt();

        List<Taxa> list = new ArrayList<>();

        for (int i = 1; i <= num; i++){
            System.out.println("Dados da pessoa #" + i);

            System.out.print("Fisica ou Juridica (f/j)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Salario anual: ");
            double salarioAnual = sc.nextDouble();

            if (ch == 'f'){
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();

                list.add(new Fisica(nome, salarioAnual, gastosSaude));

            } else if (ch == 'j') {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();

                list.add(new Juridica(nome, salarioAnual,numeroFuncionarios));

            } else {
                System.out.println("Entrada invalida");
                i--;
            }

        }

        System.out.println();
        System.out.println("TAXAS PAGAS");

        for (Taxa tax : list){
            System.out.printf("%s: R$ %.2f\n", tax.getNome(), tax.taxa());
        }

        System.out.println();

        double sum = 0;
        for (Taxa tax : list){
            sum = sum + tax.taxa();
        }

        System.out.printf("TOTAL TAXAS: R$ %.2f", sum);

        sc.close();
    }
}