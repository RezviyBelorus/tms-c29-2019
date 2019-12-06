package tms.c29.lec_17.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Alexander.Fomin
 * @since October 14, 2019
 */
public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        Callable<String> callable = () -> {
            System.out.println("Hello");
            return "Hello";
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> submit = executorService.submit(callable);

        executorService.shutdownNow();

        System.out.println("Scheduling");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(callable, 2, TimeUnit.SECONDS);
        scheduledExecutorService.awaitTermination(10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
