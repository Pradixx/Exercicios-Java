import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entitiesEnum.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do Cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de aniversário (DD/MM/AAAA): ");
        Date dataNiver = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, dataNiver);

        System.out.println("Entre com os dados do pedido:");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos itens no pedido? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Entre com os dados do pedido #" + i);
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto);

            pedido.addItem(itemPedido);
        }

        System.out.println();
        System.out.println("Resumo do Pedido:");
        System.out.println(pedido);

        sc.close();
    }
}