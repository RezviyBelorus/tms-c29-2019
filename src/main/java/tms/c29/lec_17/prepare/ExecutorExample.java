package tms.c29.lec_17.prepare;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService_1 = Executors.newFixedThreadPool(10);
        ExecutorService executorService_2 = Executors.newFixedThreadPool(10);

        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());

        Callable<String> callable = () -> Thread.currentThread().getName();

        executorService_1.submit(runnable);
        executorService_1.submit(runnable);

        Future<String> submit = executorService_2.submit(callable);
        String result = submit.get();
        System.out.println(result);

        Future<Integer> integerFuture = executorService_2.submit(new MyCallable());
        System.out.println(integerFuture.get());


        executorService_1.shutdownNow();
        executorService_2.shutdownNow();
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        return 8 * 128;
    }
}