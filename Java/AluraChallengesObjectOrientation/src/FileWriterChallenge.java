import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterChallenge {
    public void writeMessage(String fileName, String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(message);
            System.out.println("Mensagem gravada em " + fileName);
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
