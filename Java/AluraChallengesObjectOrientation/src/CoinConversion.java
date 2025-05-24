public class CoinConversion implements FinancialConversion {
    private double exchangeDollarToReal;

    public double getExchangeDollarToReal() {
        return exchangeDollarToReal;
    }

    public void setExchangeDollarToReal(double exchangeDollarToReal) {
        this.exchangeDollarToReal = exchangeDollarToReal;
    }

    @Override
    public double dollarToReal(double dollar) {
        return dollar * exchangeDollarToReal;
    }
}
