public class Main {
    public static void main(String[] args) {
        CoinGecko coinGecko = new CoinGecko();
        coinGecko.listCoins();
        coinGecko.getCoin("bitcoin");

        TheMealDb theMealDb = new TheMealDb();
        theMealDb.getReceipt("pizza");

        GoogleBooks googleBooks = new GoogleBooks();
        googleBooks.findByName("clean code");
    }
}
