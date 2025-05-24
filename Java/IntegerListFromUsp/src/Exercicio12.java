import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();

        System.out.print("Digite um número: ");
        int numA = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int numB = scanner.nextInt();

        int resto = 0;

        while (numA != 0 && numB != 0) {
            resto = numA % numB;
            numA = numB;
            numB = resto;
        }

        System.out.println("MDC é %d".formatted(numA));
    }

}
