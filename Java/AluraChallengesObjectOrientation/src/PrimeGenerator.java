public class PrimeGenerator extends PrimeNumber {
    public int generateNextPrime(int number) {
        boolean findPrime = false;
        int i = number;
        while (!findPrime) {
            i++;
            findPrime = super.isPrime(i);
        }
        return i;
    }
}
