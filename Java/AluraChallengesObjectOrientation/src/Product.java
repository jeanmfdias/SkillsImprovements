public class Product implements Calculable, Saleable {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double priceWithDiscount(double percent) {
        return this.price - (this.price * (percent / 100));
    }

    @Override
    public double totalPrice() {
        return this.price;
    }

    @Override
    public double finalPrice(int quantity) {
        if (quantity > 10) {
            return this.priceWithDiscount(10) * quantity;
        }
        return this.totalPrice() * quantity;
    }
}
