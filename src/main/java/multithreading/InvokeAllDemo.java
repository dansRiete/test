package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class InvokeAllDemo {

    private static AtomicInteger counter = new AtomicInteger(0);
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);


    private static void sendEmail(int time) {

        long start = System.currentTimeMillis();
        try {
            TimeUnit.MILLISECONDS.sleep(time);
            System.out.println(counter.incrementAndGet() + ". Task duration of " + time + "ms " + Thread.currentThread().getName() +
                    " DONE, time elapsed = " + (System.currentTimeMillis() - start));
        } catch (InterruptedException e) {
            System.out.println(counter.incrementAndGet() + ". Task duration of " + time + "ms " + Thread.currentThread().getName() +
                    " INTERRUPTED, time elapsed = " + (System.currentTimeMillis() - start));
        }

    }

    public static void main(String[] args) {
        boolean longTask = true;
        List<Callable<String>> callableList = new ArrayList<>();
        for (int i = 0; i < 80; i++){
            if(longTask){
                callableList.add(new Callable<String>() {
                    @Override public String call() throws Exception {
                        sendEmail(2000);
                        return null;
                    }
                });
                longTask = false;
            }else {
                callableList.add(new Callable<String>() {
                    @Override public String call() throws Exception {
                        sendEmail(100);
                        return null;
                    }
                });
            }
        }
        long start = System.currentTimeMillis();
        try {
            executorService.invokeAll(callableList, 1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
