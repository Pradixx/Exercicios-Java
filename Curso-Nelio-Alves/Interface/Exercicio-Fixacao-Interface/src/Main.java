import Entities.Contrato;
import Entities.Parcela;
import Services.ServicoContrato;
import Services.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Dados do contrato: ");
        System.out.print("Numero: ");
        int num = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor de contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato cont = new Contrato(num, data, valorTotal);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());

        servicoContrato.processoContrato(cont, n);

        System.out.println("Parcelas: ");
        for (Parcela parcela : cont.getParcela()){
            System.out.println(parcela);
        }

        sc.close();
    }
}