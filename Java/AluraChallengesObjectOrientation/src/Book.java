public class Book implements Calculable, Saleable {
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void details() {
        String message = """
                Book name: %s
                Author: %s
                """.formatted(name, author);
        System.out.println(message);
    }

    @Override
    public double totalPrice() {
        return this.price;
    }

    @Override
    public double finalPrice(int quantity) {
        return this.totalPrice() * quantity;
    }
}
