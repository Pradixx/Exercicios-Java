import Entities.Circulo;
import Entities.Forma;
import Entities.Retangulo;
import EntitiesEnum.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de formas: ");
        int num = sc.nextInt();

        List<Forma> list = new ArrayList<>();

        for (int i = 1; i <= num; i++){
            System.out.println("Dados da forma #" + i);

            System.out.print("Retangulo ou circulo (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Cor (BLACK/BLUE/RED): ");
            Color cor = Color.valueOf(sc.next());

            if (ch == 'r'){
                System.out.print("Largura: ");
                double largura = sc.nextDouble();

                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                list.add(new Retangulo(cor, largura, altura));

            } else if (ch == 'c') {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();

                list.add(new Circulo(cor, raio));

            } else {
                System.out.println("Entrada invalida");
                i--;
            }
        }

        System.out.println();
        System.out.println("AREAS DAS FORMAS");
        for (Forma forma : list){
            System.out.println(forma.area());
        }

        sc.close();
    }
}