package tms.c29.lec_17.classwork.point_8;

import tms.c29.lec_17.classwork.point_2.CallableExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        CallableExample callableExample = new CallableExample();

        Future<String> submit = executorService.submit(callableExample);

        String result = submit.get();

        System.out.println(result);

        executorService.awaitTermination(3, TimeUnit.SECONDS);
        executorService.shutdownNow();


        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<String> schedule = scheduledExecutorService.schedule(callableExample, 3, TimeUnit.SECONDS);
        String scheduledResult = schedule.get();
        System.out.println(scheduledResult);

        scheduledExecutorService.shutdown();
    }
}
