import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Challenge 1
        ArrayList<Person> people = new ArrayList<>();

        Person me = new Person();
        me.setName("Jean");
        me.setAge(31);

        Person myWife = new Person();
        myWife.setName("Vanessa");
        myWife.setAge(28);

        Person myDaugher = new Person();
        myDaugher.setName("Vitoria");
        myDaugher.setAge(1);

        people.add(myDaugher);
        people.add(myWife);
        people.add(me);

        System.out.println("List size: " + people.size());
        System.out.println("First person: " + people.getFirst());
        System.out.println(people);

        // Challenge 2
        ArrayList<Product> products = new ArrayList<>();

        Product rogStrix = new Product("Rog Strix G16");
        rogStrix.setQuantity(1);
        rogStrix.setPrice(11600);

        Product monitorSamsung = new Product("Monitor 27\" T350");
        monitorSamsung.setPrice(900);
        monitorSamsung.setQuantity(1);

        products.add(rogStrix);
        products.add(monitorSamsung);

        System.out.println("Products size: " + products.size());
        System.out.println("Product index 1: " + products.get(1));

        for (Product product : products) {
            System.out.println(product);
        }

        PerishableProduct lettuce = new PerishableProduct("Lettuce");
        lettuce.setQuantity(100);
        lettuce.setPrice(5);
        System.out.println(lettuce);

        ArrayList<String> myLanguages = new ArrayList<>();
        myLanguages.add("Java");
        myLanguages.add("JavaScript");
        myLanguages.add("React.js");
        myLanguages.add("PHP");

        for (String language : myLanguages) {
            System.out.println(language);
        }

        Dog dog = new Dog();
        if (dog instanceof Animal) {
            Animal animal = dog;
            System.out.println(animal);
        }

        double sumPriceProduct = 0;
        int i = 0;
        for (Product product : products) {
            sumPriceProduct += product.getPrice();
            i++;
        }
        if (i > 0) {
            System.out.println("Product price average is R$ %.2f".formatted(sumPriceProduct / i));
        }

        Circle circle = new Circle(4);
        System.out.println("Circle area: %.2f".formatted(circle.calcArea()));

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Rectangle area: %.2f".formatted(rectangle.calcArea()));

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount(123);
        bankAccount1.deposit(1000);

        BankAccount bankAccount2 = new BankAccount(456);
        bankAccount2.deposit(1001);

        BankAccount bankAccount3 = new BankAccount(789);
        bankAccount3.deposit(1003);

        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);

        BankAccount greaterAmount = new BankAccount(0);
        for (BankAccount account : bankAccounts) {
            if (account.getAmount() > greaterAmount.getAmount()) {
                greaterAmount = account;
            }
        }

        System.out.println("The account with greater amount is %d".formatted(greaterAmount.getNumber()));

        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(5);
        integers.add(20);
        System.out.println("Before sort: " + integers);
        Collections.sort(integers);
        System.out.println("After sort: " + integers);

        System.out.println("Before sort: " + people);
        Collections.sort(people);
        System.out.println("After sort: " + people);
    }
}
