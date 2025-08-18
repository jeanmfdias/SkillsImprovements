import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number to create the multiplication table: ");
        int operator = reader.nextInt();
        System.out.print("Type a number to multiplier: ");
        int multiplier = reader.nextInt();

        for (int i = 1; i <= multiplier; i++) {
            int result = operator * i;
            System.out.println(operator + " x " + i + " = " + result);
        }
    }
}
