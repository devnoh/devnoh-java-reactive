package devnoh.java.reactive.ex04;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class FutureEx2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newCachedThreadPool();

        Future<String> future = es.submit(() -> { // Callable
            Thread.sleep(2000);
            log.debug("Async");
            return "Hello";
        });

        log.debug(future.get()); // Blocking (vs. Non-Blocking)
        log.debug("Exit");
    }
}
