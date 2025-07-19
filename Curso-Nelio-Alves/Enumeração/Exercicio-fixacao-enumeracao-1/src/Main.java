import entities.Departamento;
import entities.HorasContrato;
import entities.Trabalhador;
import entitiesEnum.LevelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o seu departamento: ");
        String departamento = sc.next();

        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String trabalhadorNome = sc.next();
        System.out.print("Level: ");
        String trabalhadorLevel = sc.next();
        System.out.print("Salario Base: ");
        double trabalhadorSalarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(trabalhadorNome, LevelTrabalhador.valueOf(trabalhadorLevel) , trabalhadorSalarioBase, new Departamento(departamento));


        System.out.print("Quantos contratos esse trabalhador terá? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Entre com os dados do contrato #" + i);
            System.out.print("Data (DD/MM/AAAA): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração (Horas): ");
            int duracao = sc.nextInt();
            HorasContrato contrato = new HorasContrato(dataContrato, valorPorHora, duracao);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com o mes e ano que deseja calcular (MM/AAAA): ");
        String mesEAno = sc.next();

        int ano = Integer.parseInt(mesEAno.substring(3));
        int mes = Integer.parseInt(mesEAno.substring(0, 2));

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Valor recebido " + mesEAno + ": " + String.format("%.2f", trabalhador.calculo(ano, mes)));

        sc.close();
    }
}