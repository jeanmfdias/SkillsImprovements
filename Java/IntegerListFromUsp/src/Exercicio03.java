import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int cont = 1;
        int parada = 1;

        while (parada <= numero) {
            if (cont % 2 == 1) {
                System.out.println(cont);
                parada++;
            }
            cont++;
        }
    }
}
