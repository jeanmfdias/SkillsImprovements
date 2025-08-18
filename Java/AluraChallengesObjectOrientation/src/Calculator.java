public class Calculator implements MultiplicationTable {
    public long doubleToNumber(long number) {
        return number * 2;
    }

    @Override
    public void showMultiplicationTable(int number) {
        System.out.println("Show Multiplication table for number %d".formatted(number));
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println("%d x %d = %d".formatted(number, i, result));
        }
    }
}
