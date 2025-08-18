public class ExchangeDollarToReal {
    public static void main(String[] args) {
        double dollars = 45;
        double exchange = 6.11;
        double real = dollars * exchange;
        String message = String.format("%.2f", real);
        System.out.println("The value in Real is R$ " + message);
    }
}
