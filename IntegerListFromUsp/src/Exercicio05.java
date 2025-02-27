import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.println("Digite a o valores de venda do mês:");
        int[] vendas = new int[31];
        int maiorVenda = 0;
        int diaVenda = 0;
        for (int i = 0; i < 31; i++) {
            System.out.print("Vendas dia %d: ".formatted(i + 1));
            scanner.reset();
            vendas[i] = scanner.nextInt();
            if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
                diaVenda = i;
            }
        }

        System.out.println("Maior venda foi no dia %d no valor %d.".formatted(diaVenda + 1, maiorVenda));
    }
}
