import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do automovel: ");
        double valorCarro = sc.nextDouble();

        System.out.printf("Quanto está disposto a paga pelas parcelas: ");
        double preferenciaParcela = sc.nextDouble();

        for (int parcela = 1; parcela <= valorCarro ; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < preferenciaParcela) {
                System.out.printf("\nParcela = %d\nValor da Parcela = R$ %.2f", parcela , valorParcela);
                break;
            }
        }

        sc.close();
    }
}