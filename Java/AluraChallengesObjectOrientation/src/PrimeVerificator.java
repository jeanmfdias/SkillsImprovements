public class PrimeVerificator extends PrimeNumber {
    public void verifyIsPrime(int number) {
        boolean prime = super.isPrime(number);
        String message = prime ? "is" : "isn't";
        System.out.println("%d %s prime".formatted(number, message));
    }
}
