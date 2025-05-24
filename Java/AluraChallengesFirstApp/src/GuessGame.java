import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int num = new Random().nextInt(10);
        Scanner reader = new Scanner(System.in);
        int userNumber = 0;
        int i = 0;

        while (i < 5) {
            System.out.print("Type a number: ");
            userNumber = reader.nextInt();
            if (userNumber == num) {
                System.out.println("You guessed!");
                break;
            }
            i++;
        }
        System.out.println("The drawn number is " + num);
    }
}
