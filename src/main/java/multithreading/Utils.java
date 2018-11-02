package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Utils {

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
}
