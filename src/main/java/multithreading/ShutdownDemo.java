package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static multithreading.Utils.buildCallable;

public class ShutdownDemo {
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        executorService.submit(buildCallable(10000));
        executorService.shutdown();
        executorService.shutdownNow();
    }
}
