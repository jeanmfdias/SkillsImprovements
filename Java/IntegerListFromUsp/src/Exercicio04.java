import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.print("Digite um expoente: ");
        scanner.reset();
        int exp = scanner.nextInt();
        if (exp > 0) {
            int resultado = (int) Math.pow((double) numero, (double) exp);
            System.out.println("Resultado %d".formatted(resultado));
        } else {
            System.out.println("Expoente não pode ser negativo.");
        }
    }
}
