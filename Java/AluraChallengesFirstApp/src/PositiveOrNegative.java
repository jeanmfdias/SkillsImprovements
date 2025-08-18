import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        if (num > 0) {
            System.out.println("Number is positive!");
        } else {
            System.out.println("Number is negative!");
        }
    }
}
