package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static multithreading.Utils.buildCallable;

public class ExceutorServiceTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static AtomicInteger counter = new AtomicInteger(0);




    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Callable<String>> callables = Arrays.asList(
                buildCallable(100), buildCallable(100), buildCallable(100), buildCallable(100), buildCallable(5000),
                buildCallable(100), buildCallable(100), buildCallable(100), buildCallable(100), buildCallable(5000)
        );

        for(int i = 0; i < 20; i++){

            Executors.newSingleThreadExecutor().submit(() -> {
                try {
                    executorService.invokeAll(callables, 2000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    System.out.println(
                            "executorService.invokeAll InterruptedException");
                }
            });

            try {
                TimeUnit.MILLISECONDS.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("TimeUnit.SECONDS.sleep(1) InterruptedException");
            }

        }

        executorService.shutdown();
        executorService.shutdownNow();

        System.out.println("Finished main thread, time: " + (System.currentTimeMillis() - start));
    }
}
