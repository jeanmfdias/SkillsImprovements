import java.sql.Timestamp;

public class PerishableProduct extends Product {
    private Timestamp validityDate;

    public Timestamp getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Timestamp validityDate) {
        this.validityDate = validityDate;
    }

    public PerishableProduct(String name) {
        super(name);
    }
}
