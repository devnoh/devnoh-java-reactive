package devnoh.reactive.sample1;

public class StockInfo {
    public final String ticker;
    public final double value;

    public StockInfo(String theTicker, double theValue) {
        ticker = theTicker;
        value = theValue;
    }

    public static StockInfo fetch(String ticker) {
        return new StockInfo(ticker, YahooFinance.getPrice(ticker, false));
    }

    @Override
    public String toString() {
        return String.format("%s : %f", ticker, value);
    }
}
