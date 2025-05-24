import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número, para retorna a fibonacci: ");
        int numero = scanner.nextInt();

        int fAnt = 0;
        int fAtual = 1;
        int cont = 1;
        int fProx = 0;

        if (numero > 0) {
            while (cont < numero) {
                fProx = fAnt + fAtual;
                fAnt = fAtual;
                fAtual = fProx;
                cont++;
            }
            System.out.printf("Fibonacci %d é %d".formatted(numero, fAtual));
        }
    }

}
