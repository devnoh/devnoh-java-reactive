package devnoh.reactive.ex02;

import reactor.core.publisher.Flux;

/**
 * Flux = Publisher
 */
public class ReactorEx {

    public static void main(String[] args) {
        Flux.<Integer>create(e -> {
            e.next(1);
            e.next(2);
            e.next(3);
            e.complete();
        })
                //.log()
                .map(s -> s * 10)
                //.log()
                .subscribe(System.out::println);

        Flux.<Integer>create(e -> {
            e.next(1);
            e.next(2);
            e.next(3);
            e.complete();
        })
                //.log()
                .map(s -> s * 10)
                .reduce(0, (a, b) -> a + b)
                //.log()
                .subscribe(System.out::println);
    }
}
