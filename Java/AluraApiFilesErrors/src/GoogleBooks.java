import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBooks {
    public String findByName(String name) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=" + name.replace(" ", "+");
        return this.find(url);
    }

    public String findByAuthor(String author) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=in+author:" + author.replace(" ", "+");
        return this.find(url);
    }

    public String findBySubject(String subject) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=subject:" + subject.replace(" ", "+");
        return this.find(url);
    }

    public String findByIsbn(int isbn) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn;
        return this.find(url);
    }

    private String find(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
