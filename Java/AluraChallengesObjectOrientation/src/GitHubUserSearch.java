import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GitHubUserSearch {
    private static final String API = "https://api.github.com/users/";

    private final HttpClient client;

    public GitHubUserSearch() {
        this.client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public GitHubUser search(String username) {
        if (username == null || username.isBlank()) {
            throw new ErroConsultaGitHubException("Informe um nome de usuário válido.");
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API + username))
                .header("Accept", "application/vnd.github+json")
                .GET()
                .build();

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new ErroConsultaGitHubException("Falha ao consultar o GitHub: " + e.getMessage(), e);
        }

        if (response.statusCode() == 404) {
            throw new ErroConsultaGitHubException("Usuário '" + username + "' não encontrado no GitHub.");
        }

        if (response.statusCode() != 200) {
            throw new ErroConsultaGitHubException(
                    "Resposta inesperada do GitHub (HTTP " + response.statusCode() + ").");
        }

        return parse(response.body());
    }

    private GitHubUser parse(String json) {
        GitHubUser user = new GitHubUser();
        user.setLogin(extractString(json, "login"));
        user.setName(extractString(json, "name"));
        user.setBio(extractString(json, "bio"));
        user.setLocation(extractString(json, "location"));
        user.setPublicRepos(extractInt(json, "public_repos"));
        user.setFollowers(extractInt(json, "followers"));
        user.setFollowing(extractInt(json, "following"));
        return user;
    }

    private String extractString(String json, String key) {
        Pattern p = Pattern.compile("\"" + Pattern.quote(key) + "\"\\s*:\\s*(\"((?:\\\\.|[^\"\\\\])*)\"|null)");
        Matcher m = p.matcher(json);
        if (!m.find()) return null;
        if (m.group(1).equals("null")) return null;
        return m.group(2).replace("\\\"", "\"").replace("\\\\", "\\").replace("\\n", "\n");
    }

    private int extractInt(String json, String key) {
        Pattern p = Pattern.compile("\"" + Pattern.quote(key) + "\"\\s*:\\s*(-?\\d+)");
        Matcher m = p.matcher(json);
        if (!m.find()) return 0;
        return Integer.parseInt(m.group(1));
    }
}
