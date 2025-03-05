import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int acumulador = 0;

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                acumulador += i;
            }
        }

        System.out.println("A soma dos números pares é: %d".formatted(acumulador));
    }
}
