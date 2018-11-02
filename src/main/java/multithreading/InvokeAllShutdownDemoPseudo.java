package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

import static multithreading.Utils.buildCallable;

public class InvokeAllShutdownDemoPseudo {

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static final int TIME_OUT = 5000;

    public static void main(String[] args) {

        /*List<Callable<String>> tasks = Arrays.asList(
                buildCallable(1000), buildCallable(1000),
                buildCallable(1000), buildCallable(10000)
        );

        List<Future<String>> futures = executorService.invokeAll(tasks, 3, TimeUnit.SECONDS);
        new Thread(new Runnable() {
            @Override public void run() {
                Thread.sleep(TIME_OUT);
                futures.stream().filter(future -> !future.isDone()).forEach(future -> future.cancel(true));
            }
        }).start();*/

    }
}
