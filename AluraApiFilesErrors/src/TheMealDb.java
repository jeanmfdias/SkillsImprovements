import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TheMealDb {
    public void getReceipt(String name) {
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + name.replace(" ", "+");
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
