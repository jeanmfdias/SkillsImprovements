import com.google.gson.Gson;
import models.Recipes;

public class Main {
    public static void main(String[] args) {
        CoinGecko coinGecko = new CoinGecko();
        String coins = coinGecko.listCoins();
        String coin = coinGecko.getCoin("bitcoin");

        TheMealDb theMealDb = new TheMealDb();
        String receiptJson = theMealDb.getReceipt("pizza");

        GoogleBooks googleBooks = new GoogleBooks();
        String books = googleBooks.findByName("clean code");

        Gson gson = new Gson();
        System.out.println(receiptJson);
        Recipes meals = gson.fromJson(receiptJson, Recipes.class);
        System.out.println(meals);
    }
}
