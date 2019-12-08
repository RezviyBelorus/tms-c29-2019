package tms.c29.lec_17.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Factorial implements Callable<Long> {
    private int begin;
    private int end;

    public Factorial(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long result = begin;
        for (int i = ++begin; i <= end; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
//после 12 считает неправильно(независимо от "devidedNum").Как исправить ситуацию?
        int num = 13;

        int devidedNum = num / 2;

        Callable<Long> factorialFirst = new Factorial(1, devidedNum);
        Callable<Long> factorialSecond = new Factorial(devidedNum + 1, num);

        List<Callable<Long>> factorials = List.of(factorialFirst, factorialSecond);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<Long>> futures = new ArrayList<>(2);
        factorials.forEach(factorial -> {
            Future<Long> submit = executorService.submit(factorial);
            futures.add(submit);
        });

        OptionalLong factorial = futures.stream()
            .mapToLong(future -> {
                try {
                    return future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    throw new RuntimeException();
                }
                return 1;
            })
            .reduce((x, y) -> x * y);

        System.out.println(factorial.getAsLong());

        executorService.shutdown();

    }
}
