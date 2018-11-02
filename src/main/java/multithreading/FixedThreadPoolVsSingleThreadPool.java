package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolVsSingleThreadPool {

    public static void main(String[] args) {

        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        final ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        executorService.submit(() -> {
            try {
                System.out.println("Started thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Finished thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println("Started thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Finished thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
