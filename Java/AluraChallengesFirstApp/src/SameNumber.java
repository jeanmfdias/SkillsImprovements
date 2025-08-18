import java.util.Scanner;

public class SameNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.print("Type a number: ");
        num1 = reader.nextInt();
        System.out.print("Type another number: ");
        num2 = reader.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equals!");
        } else if (num1 > num2) {
            System.out.println("First number is greater than second number!");
        } else {
            System.out.println("Second number is greater than first number!");
        }
    }
}
