import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        scanner.reset();
        int num = scanner.nextInt();

        int i = 1;
        while (i * (i + 1) * (i + 2) < num) {
            i++;
        }

        if (i * (i + 1) * (i + 2) == num) {
            System.out.println("%d é um triangulo.".formatted(num));
        } else {
            System.out.println("%d não é um triangulo.".formatted(num));
        }
    }

}
