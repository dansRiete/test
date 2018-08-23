package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadInvokeAllExecutorDemo {
    public static void main(String[] args) {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        Executors.newSingleThreadExecutor().submit(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ready");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Executors.newSingleThreadExecutor().submit(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ready");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
