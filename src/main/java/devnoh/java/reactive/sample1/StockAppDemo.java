package devnoh.java.reactive.sample1;

import rx.Observable;

import java.util.Arrays;
import java.util.List;

public class StockAppDemo {
  public static void main(String[] args) {

    List<String> symbols = Arrays.asList("AMZN", "GOOG", "ORCL");

    Observable<StockInfo> feed = StockServer.getFeed(symbols);

    feed.subscribe(System.out::println);
  }
}