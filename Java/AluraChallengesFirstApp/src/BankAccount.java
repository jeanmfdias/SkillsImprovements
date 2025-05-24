import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = reader.nextLine();
        System.out.print("What's your amount account: ");
        double amount = reader.nextDouble();
        int menu = 0;

        String intro = """
                ##################################################
                Name: %s
                Amount: R$ %.2f
                ##################################################
                """.formatted(name, amount);
        System.out.println(intro);

        while (menu != 4) {
            String menuLabel = """
                    1 - Check Amount
                    2 - Deposit
                    3 - Withdraw
                    4 - Exit
                    """;
            System.out.println(menuLabel);
            menu = reader.nextInt();

            System.out.println("##################################################");
            switch (menu) {
                case 1:
                    System.out.println("Your amount is R$ %.2f".formatted(amount));
                    break;
                case 2:
                    System.out.print("Type your deposit: ");
                    double deposit = reader.nextDouble();
                    if (deposit > 0) {
                        amount += deposit;
                        System.out.println("Deposit with success!");
                    } else {
                        System.out.println("Error on deposit!");
                    }
                    break;
                case 3:
                    System.out.println("Type your withdraw: ");
                    double withdraw = reader.nextDouble();
                    if (withdraw > 0 && withdraw <= amount) {
                        amount -= withdraw;
                        System.out.println("Withdraw with success!");
                    } else {
                        System.out.println("Error on withdraw");
                    }
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            System.out.println("##################################################");
        }
    }
}
