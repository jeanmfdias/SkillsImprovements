import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number to calculate its factorial: ");
        int num = reader.nextInt();
        int factorial = num;

        for (int i = num - 1; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("The factorial is " + factorial);
    }
}
