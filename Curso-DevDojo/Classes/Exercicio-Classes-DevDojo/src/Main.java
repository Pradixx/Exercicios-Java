import Entities.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do carro: ");
        String nome = sc.next();

        System.out.print("Digite a marca do carro: ");
        String marca = sc.next();

        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.next();

        System.out.print("Digite o ano do carro: ");
        int ano = sc.nextInt();

        Carro carro = new Carro(nome, modelo, marca, ano);

        System.out.println();

        System.out.println("---- Dados do carro ----" );
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        sc.close();
    }
}