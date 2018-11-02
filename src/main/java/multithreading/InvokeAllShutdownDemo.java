package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static multithreading.Utils.buildCallable;

public class InvokeAllShutdownDemo {

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static final int TIME_OUT = 5000;

    public static Callable<String> buildCallable(int time) {
        return () -> {
            AtomicInteger counter = new AtomicInteger(0);
            long start = System.currentTimeMillis();
            try {
                TimeUnit.MILLISECONDS.sleep(time);
                System.out.println(counter.incrementAndGet() + ". Task " + time + " " + Thread.currentThread().getName() +
                        " has been done, time elapsed = " + (System.currentTimeMillis() - start));
                return "Task " + time + " " + Thread.currentThread().getName() + " done, time elapsed = " +
                        (System.currentTimeMillis() - start);
            } catch (InterruptedException e) {
                System.out.println(counter.incrementAndGet() + ". Task " + time + " " + Thread.currentThread().getName() +
                        " has been interrupted, time elapsed = " + (System.currentTimeMillis() - start));
            }
            return null;
        };

    }

    public static void main(String[] args) {

        List<Callable<String>> tasks = Arrays.asList(
                buildCallable(1000), buildCallable(1000),
                buildCallable(1000), buildCallable(10000)
        );

        List<Future<String>> futures = new ArrayList<>();
        tasks.forEach(task -> futures.add(executorService.submit(task)));
        new Thread(() -> {
            try {
                Thread.sleep(TIME_OUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            futures.stream().filter(future -> !future.isDone()).forEach(future -> future.cancel(true));
        }).start();
        executorService.shutdown();

    }
}
