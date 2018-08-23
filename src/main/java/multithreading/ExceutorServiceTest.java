package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExceutorServiceTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static AtomicInteger counter = new AtomicInteger(0);

    private static Callable<String> sendEmail(int time) {
        return () -> {
            long start = System.currentTimeMillis();
            try {
                TimeUnit.MILLISECONDS.sleep(time);
                System.out.println(counter.incrementAndGet() + ". Task " + time + " " + Thread.currentThread().getName() + " has been done, time elapsed = " + (System.currentTimeMillis() - start));
                return "Task " + time + " " + Thread.currentThread().getName() + " done, time elapsed = " + (System.currentTimeMillis() - start);
            } catch (InterruptedException e) {
                System.out.println(counter.incrementAndGet() + ". Task " + time + " " + Thread.currentThread().getName() + " has been interrupted, time elapsed = " + (System.currentTimeMillis() - start));
            }
            return null;
        };

    }


    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Callable<String>> callables = Arrays.asList(
                sendEmail(100), sendEmail(100), sendEmail(100), sendEmail(100), sendEmail(5000),
                sendEmail(100), sendEmail(100), sendEmail(100), sendEmail(100), sendEmail(5000)
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

        System.out.println("Finished main thread, time: " + (System.currentTimeMillis() - start));
    }
}
