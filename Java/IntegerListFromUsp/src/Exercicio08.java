import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = fatorial(numero);
        System.out.println("O fatorial de %d é %d".formatted(numero, fatorial));
    }

    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }
}
