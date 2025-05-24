public class BankAccount {
    private int number;
    private double amount;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public double getAmount() {
        return this.amount;
    }

    public boolean deposit(double value) {
        if (value > 0) {
            this.amount += value;
            return true;
        }
        return false;
    }

    public boolean withdraw(double value) {
        if (this.amount >= value) {
            this.amount -= value;
            return true;
        }
        return false;
    }
}
