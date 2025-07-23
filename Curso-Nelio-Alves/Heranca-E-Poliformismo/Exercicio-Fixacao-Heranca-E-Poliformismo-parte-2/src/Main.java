import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de produtos: ");
        int num = sc.nextInt();

        List<Produto> list = new ArrayList<>();

        String nome;
        double preco;
        double custosFee;
        String dataEntrada;

        for (int i = 1; i <= num; i++) {
            System.out.println("Dados do produto #" + i);

            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char ch = sc.next().charAt(0);


            switch (ch) {
                case 'c':
                    System.out.print("Nome: ");
                    nome = sc.next();

                    System.out.print("Preco: ");
                    preco = sc.nextDouble();

                    list.add(new Produto(nome, preco));
                    break;
                case 'u':
                    System.out.print("Nome: ");
                    nome = sc.next();

                    System.out.print("Preco: ");
                    preco = sc.nextDouble();

                    System.out.print("Data (DD/MM/YYYY): ");
                    dataEntrada = sc.next();

                    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

                    Date data = dataFormatada.parse(dataEntrada);
                    list.add(new ProdutoUsado(nome, preco, data));
                    break;
                case 'i':
                    System.out.print("Nome: ");
                    nome = sc.next();

                    System.out.print("Preco: ");
                    preco = sc.nextDouble();

                    System.out.print("Custos Fee: ");
                    custosFee = sc.nextDouble();

                    list.add(new ProdutoImportado(nome, preco, custosFee));
                    break;
                default:
                    System.out.println("Erro na entrada");
                    i--;
                    break;


            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Produto pro : list) {
            System.out.println(pro.priceTag());

            sc.close();
        }
    }
}