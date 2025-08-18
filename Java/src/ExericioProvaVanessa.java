import java.util.Scanner;

public class ExericioProvaVanessa {

    public static void main(String[] args) {
        funcaoParaFalarAlgo("Jean");

        exercicio3();
    }

    public static void funcaoParaFalarAlgo(String nome) {
        System.out.println("Falando com " + nome);
    }

    public static void exercicio3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        int  i = 0;

        while (i < numero * 3) {
            i = i + numero * 2;
        }

        System.out.println("i = " + i);
    }

}
