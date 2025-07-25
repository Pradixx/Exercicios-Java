import Entities.Arqueiro;
import Entities.Guerreiro;
import Entities.Mago;
import Entities.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Personagem> list = new ArrayList<>();

        System.out.print("Digite o número de personagens: ");
        int num = sc.nextInt();

        String tipo = "";
        for (int i = 1; i <= num; i++) {
            System.out.println("Dados do personagem #" + i);

            System.out.print("Guerreiro, Mago, Arqueiro (G/M/A)? ");
            char per = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            if (per == 'G'){
                tipo= "Guerreiro";
            } else if (per == 'M') {
                tipo = "Mago";
            } else if (per == 'A') {
                tipo = "Arqueiro";
            } else {
                System.out.println("Entrada errada");
                i--;
            }

            System.out.print("Energia: ");
            int energia = sc.nextInt();

            if (per == 'G'){
                list.add(new Guerreiro(nome, tipo, energia));
            } else if (per == 'M') {
                list.add(new Mago(nome, tipo, energia));
            } else if (per == 'A') {
                list.add(new Arqueiro(nome, tipo, energia));
            } else {
                System.out.println("Entrada errada");
                i--;
            }
        }

        System.out.println();

        System.out.print("Deseja ativar habilidades (Y/N)? ");
        char conti = sc.next().charAt(0);

        String nomeProcurado = "";
        while (conti == 'Y'){
            System.out.print("Qual personagem (G/M/A)? ");
            char ch = sc.next().charAt(0);

            boolean encontrado;

            if (ch == 'G'){
                nomeProcurado = "Guerreiro";
                encontrado = false;
                for (Personagem personagem : list) {
                    if (personagem.getTipo().equals(nomeProcurado)){
                        personagem.usarHabilidade();
                        encontrado = true;
                    }

                    if (!encontrado) {
                        System.out.println("Personagem não encontrado");
                    }
                }
            } else if (ch == 'M') {
                nomeProcurado = "Mago";
                encontrado = false;
                for (Personagem personagem : list) {
                    if (personagem.getTipo().equals(nomeProcurado)){
                        personagem.usarHabilidade();
                        encontrado = true;
                    }

                    if (!encontrado) {
                        System.out.println("Personagem não encontrado");
                    }
                }
            } else if (ch == 'A') {
                nomeProcurado = "Arqueiro";
                encontrado = false;
                for (Personagem personagem : list) {
                    if (personagem.getTipo().equals(nomeProcurado)){
                        personagem.usarHabilidade();
                        encontrado = true;
                    }

                    if (!encontrado) {
                        System.out.println("Personagem não encontrado");
                    }
                }
            } else {
                System.out.println("Entrada errada");
                break;
            }

            System.out.println();
            System.out.println("-----------");

            for (Personagem perso : list){
                System.out.println(perso.exibirStatus());
            }

            System.out.println("-----------");
            System.out.println();


            System.out.print("Deseja ativar outra habilidades (Y/N)? ");
            conti = sc.next().charAt(0);
        }

        System.out.println("## FIM DO PROGRAMA ##");

        sc.close();
    }
}