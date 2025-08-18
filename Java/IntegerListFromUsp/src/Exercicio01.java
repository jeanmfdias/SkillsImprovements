import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        while (numero != 0) {
            scanner.reset();
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            int quadrado = numero * numero;
            System.out.println("O quadrado de %d é %d".formatted(numero, quadrado));
        }
    }
}
