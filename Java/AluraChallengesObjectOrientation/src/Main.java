import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Challenge 1
        Person person = new Person();
        person.helloWorld();

        // Challenge 2
        Calculator calculator = new Calculator();
        long number = calculator.doubleToNumber(50);
        System.out.println(number);

        // Challenge 3
        Music music = new Music();
        music.setTitle("Smells Like Teen Spirit");
        music.setArtist("Nirvana");
        music.setLaunchYear(1991);

        int rate = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            rate = random.nextInt(10);
            music.rate(rate);
        }

        music.details();
        System.out.println("Rating: " + music.getMediaRating());

        // Challenge 4
        Car compass = new Car();
        compass.setBrand("Jeep");
        compass.setModel("Compass");
        compass.setLaunchYear(2017);
        compass.setColor("White");

        compass.details();
        System.out.println("Car Age: " + compass.getAge());

        // Challenge 5
        Student student = new Student();
        student.setAge(31);
        student.setName("Jean Dias");

        student.details();

        // Challenge 6
        BankAccount bankAccount = new BankAccount();

        // Challenge 7
        person.setName("Jean Dias");
        person.setAge(31);

        System.out.println("Is adult? " + person.isAdult());

        // Challenge 8
        Product rogStrix = new Product();
        rogStrix.setName("Asus Rog Strix G16");
        rogStrix.setPrice(11600);
        System.out.println("Price with discount: R$ %.2f".formatted(rogStrix.priceWithDiscount(10)));

        //Challenge 9
        student.setScore1(6);
        student.setScore2(8);
        student.setScore3(4);
        student.setScore4(7);
        System.out.println("The average to %s is %.2f".formatted(student.getName(), student.getAverege()));

        // Challenge 10
        Book book = new Book();
        book.setAuthor("Alex Coelho");
        book.setName("Java com Orientação a Objeto");
        book.details();

        // Challenge 11
        CarModel renegade = new CarModel();
        renegade.setBrand("Jeep");
        renegade.setModel("Renegade");
        renegade.setLaunchYear(2016);
        renegade.setColor("Gray");
        renegade.setYear(2017);
        renegade.setPrice(75000);
        renegade.details();

        // Challenge 12
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.doNoise();
        cat.doNoise();
        dog.waggingTail();
        cat.scratchForniture();

        //Challenge 13
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.owner = "Jean";
        currentAccount.depoist(100);
        System.out.println("Before tax: %.2f".formatted(currentAccount.getAmount()));
        currentAccount.chargeMonthlyTax();
        System.out.println("After tax: %.2f".formatted(currentAccount.getAmount()));

        // Challenge 14
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.listPrime(20);

        PrimeVerificator primeVerificator = new PrimeVerificator();
        primeVerificator.verifyIsPrime(2);
        primeVerificator.verifyIsPrime(3);
        primeVerificator.verifyIsPrime(9);
        primeVerificator.verifyIsPrime(65);
        primeVerificator.verifyIsPrime(97);

        PrimeGenerator primeGenerator = new PrimeGenerator();
        int num = 15;
        int result = primeGenerator.generateNextPrime(num);
        System.out.println("The next prime to %d is %d".formatted(num, result));

        // Challenge 15
        CoinConversion coinConversion = new CoinConversion();
        double exchange = 6.04;
        coinConversion.setExchangeDollarToReal(exchange);
        double dollar = 5500;
        System.out.println("US$ %.2f is R$ %.2f on exchange is %.2f"
                .formatted(dollar, coinConversion.dollarToReal(dollar), exchange));

        // Challenge 16
        RoomRectangle room = new RoomRectangle();
        double roomSideA = 4;
        double roomSideB = 3;
        System.out.println("Area is %.2f".formatted(room.area(roomSideA, roomSideB)));
        System.out.println("Perimeter is %.2f".formatted(room.perimeter(roomSideA, roomSideB)));

        // Challenge 17
        calculator.showMultiplicationTable(7);

        // Challenge 18
        WeatherCalc weatherCalc = new WeatherCalc();
        System.out.println("35º celsius is %.2fº fahrenheit".formatted(weatherCalc.celsiusToFahrenheit(35)));
        System.out.println("98º fairenheit is %.2fº celsius".formatted(weatherCalc.fahrenheitToCelsius(98)));

        // Challenge 19
        book.setPrice(15);
        System.out.println("Book price is R$ %.2f".formatted(book.totalPrice()));
        System.out.println("Product price is R$ %.2f".formatted(rogStrix.totalPrice()));

        // Challenge 20
        System.out.println("10 books sell by R$ %.2f".formatted(book.finalPrice(10)));
        System.out.println("10 Rog Strix sell by R$ %.2f".formatted(rogStrix.finalPrice(10)));
        System.out.println("11 Rog Strix sell by R$ %.2f - with promo".formatted(rogStrix.finalPrice(11)));
    }
}
