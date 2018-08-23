package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class CompletableFutureDemo {
    private void asyncExample() throws InterruptedException, ExecutionException
    {
        final CompletableFuture<String> future = supplyAsync(() -> {
            for(int i = 0; i<10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
            return "F";
        }).thenApplyAsync(this::append_oo);
        System.out.println(future.get());
    }

    private String append_oo(String str)
    {
        return str +"oo";
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new CompletableFutureDemo().asyncExample();
    }

}
