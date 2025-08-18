public class BankAccount {
    protected int number;
    protected double amount;
    public String owner;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public boolean depoist(double amount) {
        if (amount > 0) {
            this.amount += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }
}
