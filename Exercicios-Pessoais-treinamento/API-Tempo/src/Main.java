import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da cidade: ");
        String cidade = sc.next();


        String key = "&appid=84be6908b531af60a7d5394de206f987";
        String enderecoGeo = "http://api.openweathermap.org/geo/1.0/direct?q=" + cidade + "&limit=5" + key;


        HttpRequest requestGeo = HttpRequest.newBuilder()
                .uri(URI.create(enderecoGeo))
                .build();

        HttpResponse<String> responseGeo = client
                .send(requestGeo, HttpResponse.BodyHandlers.ofString());


        String json = responseGeo.body();
        String lat = json.split("\"lat\":")[1].split(",")[0].trim();
        String lon = json.split("\"lon\":")[1].split(",")[0].trim();

        String latLon = "lat=" + lat + "&lon=" + lon;
        String enderecoMeteo = "https://api.openweathermap.org/data/2.5/weather?" + latLon + key;


        HttpRequest requestMeteo = HttpRequest.newBuilder()
                .uri(URI.create(enderecoMeteo))
                .build();

        HttpResponse<String> responseMeteo = client
                .send(requestMeteo, HttpResponse.BodyHandlers.ofString());

        System.out.println(responseMeteo.body());

        sc.close();
    }
}
