import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número para a sequência: ");
        int n = scanner.nextInt();
        System.out.print("Digite o primeiro número: ");
        scanner.reset();
        int i = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        scanner.reset();
        int j = scanner.nextInt();
        boolean ehMultiplo = false;
        int show = 0;
        int cont = 0;

        while (show < n) {
            ehMultiplo = false;
            if (cont % i == 0) {
                ehMultiplo = true;
            }
            if (cont % j == 0) {
                ehMultiplo = true;
            }
            if (ehMultiplo) {
                System.out.print("%d ".formatted(cont));
                show++;
            }
            cont++;
        }
    }
}
