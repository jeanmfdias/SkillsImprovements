public class Main {
    public static void main(String[] args) {
        CoinGecko coinGecko = new CoinGecko();
        coinGecko.listCoins();
        coinGecko.getCoin("bitcoin");
    }
}
