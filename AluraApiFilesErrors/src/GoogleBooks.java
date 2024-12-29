import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBooks {
    public void findByName(String name) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=" + name.replace(" ", "+");
        this.find(url);
    }

    public void findByAuthor(String author) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=in+author:" + author.replace(" ", "+");
        this.find(url);
    }

    public void findBySubject(String subject) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=subject:" + subject.replace(" ", "+");
        this.find(url);
    }

    public void findByIsbn(int isbn) {
        String url = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn;
        this.find(url);
    }

    private void find(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
