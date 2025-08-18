import com.google.gson.Gson;
import exceptions.InvalidPasswordException;
import models.Coin;
import models.Recipes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoinGecko coinGecko = new CoinGecko();
        String coins = coinGecko.listCoins();
        String coinJson = coinGecko.getCoin("bitcoin");

        TheMealDb theMealDb = new TheMealDb();
        String receiptJson = theMealDb.getReceipt("pizza");

        GoogleBooks googleBooks = new GoogleBooks();
        String books = googleBooks.findByName("clean code");

        Gson gson = new Gson();
        System.out.println(receiptJson);
        Recipes meals = gson.fromJson(receiptJson, Recipes.class);
        System.out.println(meals);

        System.out.println(coinJson);
        Coin coin = gson.fromJson(coinJson, Coin.class);
        System.out.println(coin);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your password: ");
        scanner.reset();
        String password = scanner.nextLine();

        try {
            if (password.length() < 8) {
                throw new InvalidPasswordException("Password smaller then 8 character");
            }
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
