public class CurrentAccount extends BankAccount {
    private double tax = 9.99;

    public void chargeMonthlyTax() {
        this.amount -= this.tax;
    }
}
