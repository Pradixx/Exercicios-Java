import Entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com o caminho do arquivo: ");
        String caminhoArquivoStr = sc.next();

        File caminhoArquivo = new File(caminhoArquivoStr);
        String caminhoPastaStr = caminhoArquivo.getParent();

        boolean sucesso = new File(caminhoPastaStr + "\\out").mkdir();

        String arquivoAlvoStr = caminhoPastaStr + "\\out\\sumary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivoStr))){
            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] separacao = itemCsv.split(",");
                String nome = separacao[0];
                double preco = Double.parseDouble(separacao[1]);
                int quantidade = Integer.parseInt(separacao[2]);

                list.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAlvoStr))) {

                for (Produto item : list) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(arquivoAlvoStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Erro na escrita do arquivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        }

        sc.close();

    }
}