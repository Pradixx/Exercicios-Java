import Entities.Empregado;
import Entities.EmpregadoTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de empregados: ");
        int num = sc.nextInt();;

        List<Empregado> list = new ArrayList<>();

        for (int i = 1; i <= num; i++){
            System.out.println("Dados do empregado #" + i);

            System.out.print("Empregado terceirizado(y/n): ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Horas: ");
            int horas = sc.nextInt();

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (ch == 'y'){
                System.out.print("Digite o valor do adicional: ");
                int porcetagem = sc.nextInt();
                list.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, porcetagem));
            } else {
                list.add(new Empregado(nome, horas, valorPorHora));
            }
        }

        System.out.println();
        System.out.println("Pagamentos:");
        for (Empregado emp : list){
            System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
        }

        sc.close();
    }
}