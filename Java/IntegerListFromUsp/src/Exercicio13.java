import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int i = 1;
            int soma = 0;
            while (i < numero) {
                if (numero % i == 0) {
                    soma += i;
                }
                i++;
            }
            if (soma == numero) {
                System.out.println("%d é um número perfeito.".formatted(numero));
            } else {
                System.out.println("%d não é um número perfeito.".formatted(numero));
            }
        } else {
            System.out.println("Número digitado é menor que zero");
        }
    }

}
