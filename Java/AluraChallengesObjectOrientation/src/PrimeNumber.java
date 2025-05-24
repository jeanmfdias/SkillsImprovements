public class PrimeNumber {
    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public void listPrime(int limit) {
        limit = limit > 0 ? limit : 100;
        for (int i = 1; i <= limit; i++) {
            boolean prime = isPrime(i);
            String message = prime ? "is" : "isn't";
            System.out.println("%d %s prime".formatted(i, message));
        }
    }
}
