import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

public class UploadLimitSize {
    public static void main(String[] args) {
        String urlPhoto = "https://wallpapercave.com/wp/wp9404175.jpg";
        String savePath = "./out/wp9404175.jpg";

        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(urlPhoto).openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            int responseCode = urlConnection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("Error on connect: Response Code " + responseCode);
                return;
            }

            try (BufferedInputStream in = new BufferedInputStream(urlConnection.getInputStream());
                FileOutputStream out = new FileOutputStream(savePath)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }

            File file = new File(savePath);
            long fileSize = file.length();
            long validSize = 1000000;
            double showValidSize = (double) validSize / 1024 / 1024;

            if (fileSize > validSize) {
                System.out.println("File gretter than %.2fMb (%.2fMb)".formatted(showValidSize, ((double) fileSize / 1024 / 1024)));
            } else {
                System.out.println("File smaller than equal %.2fMb".formatted(showValidSize));
            }

            Files.delete(file.toPath());
        } catch (IOException e) {
            System.out.println("Error on download file: " + e.getMessage());
        }
    }
}
