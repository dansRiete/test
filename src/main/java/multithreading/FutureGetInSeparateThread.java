package multithreading;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressWarnings("Duplicates") public class FutureGetInSeparateThread {

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static AtomicInteger counter = new AtomicInteger(0);
    private static Random random = new Random();

    private static void sendEmail() {

        long start = System.currentTimeMillis();
        final int timeout = random.nextInt(500);
        try {
            TimeUnit.MILLISECONDS.sleep(timeout);
            System.out.println(counter.incrementAndGet() + ". Task duration of " + timeout + "ms " + Thread.currentThread().getName() +
                    " DONE, time elapsed = " + (System.currentTimeMillis() - start));
        } catch (InterruptedException e) {
            System.out.println(counter.incrementAndGet() + ". Task duration of " + timeout + "ms " + Thread.currentThread().getName() +
                    " INTERRUPTED, time elapsed = " + (System.currentTimeMillis() - start));
        }

    }

    public static void main(String[] args) {
        for(int i = 0; i < 50; i++){

            for(int i1 = 0; i1 < random.nextInt(10); i1++){
                Future task = executorService.submit(FutureGetInSeparateThread::sendEmail);
                Executors.newSingleThreadExecutor().submit(()->{
                        try {
                            task.get(300, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException | ExecutionException e) {
                            e.printStackTrace();
                        } catch (TimeoutException e) {
                            task.cancel(true);
                        }
                });
            }

            try {
                TimeUnit.MILLISECONDS.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
