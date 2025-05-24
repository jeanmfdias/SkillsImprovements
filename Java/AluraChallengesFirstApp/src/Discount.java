public class Discount {
    public static void main(String[] args) {
        double price = 1670.10;
        double discount = 10; // percent
        double finalPrice = price - (price * (discount / 100));
        String message = String.format(
                "The product with %.2f percent of discount is R$ %.2f",
                discount, finalPrice);
        System.out.println(message);
    }
}
