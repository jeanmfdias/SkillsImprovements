import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        scanner.reset();
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        System.out.print("A soma dos primeiros %d números inteiros positivos é: %d".formatted(numero, soma));
    }
}
