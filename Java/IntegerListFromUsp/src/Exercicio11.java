import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        scanner.reset();
        int num = scanner.nextInt();

        int i = 2;
        boolean divide = false;
        if (num > 0) {
            while (i < num) {
                if (num % i == 0) {
                    divide = true;
                }
                i++;
            }

            if (!divide) {
                System.out.println("Número é primo");
            } else {
                System.out.println("Número não é primo");
            }
        }
    }
}
