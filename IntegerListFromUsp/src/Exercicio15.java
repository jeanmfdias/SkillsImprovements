import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();

        System.out.print("Digite o quantidade de Números: ");
        int n = scanner.nextInt();

        System.out.print("Digite um número J: ");
        int j = scanner.nextInt();

        System.out.print("Digite o módulo a validar: ");
        int m = scanner.nextInt();

        int c = 1;
        int i = 1;
        while (c <= n) {
            if (j % m == i % m && j != i) {
                System.out.println("%d e %d são congruentes.".formatted(j, i));
                c++;
            }
            i++;
        }
    }

}
