import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinGecko {
    public void listCoins() {
        String url = "https://api.coingecko.com/api/v3/coins/list";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
