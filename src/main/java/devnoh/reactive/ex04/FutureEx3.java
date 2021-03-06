package devnoh.reactive.ex04;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Async - Future
 */
@Slf4j
public class FutureEx3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newCachedThreadPool();

        Future<String> f = es.submit(() -> { // Callable
            Thread.sleep(2000);
            log.debug("Async");
            return "Hello";
        });

        while (!f.isDone()) {
            log.debug("> " + f.isDone());
            Thread.sleep(500);
        }

        log.debug("> " + f.isDone());
        log.debug(f.get()); // Blocking (vs. Non-Blocking)
        log.debug("Exit");
    }
}
