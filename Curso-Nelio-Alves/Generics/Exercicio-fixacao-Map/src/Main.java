import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory: ");
        String directory = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(directory))) {

            Map<String, Integer> contagem = new HashMap<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String candidato = fields[0];
                int votos = Integer.parseInt(fields[1]);

                if (contagem.containsKey(candidato)) {
                    int votosMomento = contagem.get(candidato);
                    contagem.put(candidato, votos + votosMomento);
                } else {
                    contagem.put(candidato, votos);
                }

                line = br.readLine();
            }

            System.out.println("---- CONTAGEM TOTAL ----");
            for (String key : contagem.keySet()) {
                System.out.println(key + ": " + contagem.get(key));
            }

        } catch (IOException e ) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
