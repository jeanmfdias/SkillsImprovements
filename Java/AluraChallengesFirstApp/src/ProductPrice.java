public class ProductPrice {
    public static void main(String[] args) {
        double price = 1245.67;
        int quantity = 15;
        double productPrice = price * quantity;
        String message = String.format(
                "The product price is %.2f",
                productPrice);
        System.out.println(message);
    }
}
