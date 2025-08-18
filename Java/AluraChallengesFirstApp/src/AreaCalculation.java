import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice = -1;
        double area = 0;
        String intro = """
                \nType 0 to Close
                Type 1 to calculate Square Area
                Type 2 to calculate Circle Area
                """;

        while (choice != 0) {
            System.out.println(intro);
            choice = reader.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Type square side: ");
                    double side = reader.nextDouble();
                    area = side * side;
                    System.out.println("The square area is " + area);
                    break;
                case 2:
                    System.out.println("Type circle radius: ");
                    double radius = reader.nextDouble();
                    area = 3.14 * (radius * radius);
                    System.out.println("The circle area is " + area);
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
