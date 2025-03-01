import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        int maiorNota = 0;
        int menorNota = 100;
        System.out.print("Digite a quantidade de aluno: ");
        int numeroAlunos = scanner.nextInt();
        int nota = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Nota %d: ".formatted(i + 1));
            nota = scanner.nextInt();
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        System.out.println("A maior nota é: %d".formatted(maiorNota));
        System.out.println("A menor nota é: %d".formatted(menorNota));
    }
}
