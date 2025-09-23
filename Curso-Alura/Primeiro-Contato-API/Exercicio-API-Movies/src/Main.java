import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Token API 5a140cc2

        HttpClient client = HttpClient.newHttpClient();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o filme de busca: ");
        String filme = sc.next();

        String key = "&apikey=5a140cc2";
        String endereco = "http://www.omdbapi.com/?t=" + filme + key;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        String json = response.body();
        String year = json.split("\"Year\":\"")[1].split("\"")[0];
        System.out.println("Ano: " + year);

        sc.close();
    }
}
