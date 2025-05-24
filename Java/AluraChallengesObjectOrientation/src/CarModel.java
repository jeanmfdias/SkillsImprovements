public class CarModel extends Car {
    private double price;
    private int year;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void details() {
        super.details();
        String message = """
                Model year: %s
                Price: %.2f
                """.formatted(year, price);
        System.out.println(message);
    }
}
