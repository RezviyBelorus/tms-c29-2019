package tms.c29.lec_17.classwork.point_4;

import java.util.concurrent.Semaphore;

public class Bank implements Runnable {
    private String name;
    private Semaphore semaphore;
    private int sumOfTransaction;

    public Bank(String name, Semaphore semaphore, int sumOfTransaction) {
        this.name = name;
        this.semaphore = semaphore;
        this.sumOfTransaction = sumOfTransaction;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();

            System.out.println(String.format("[%s] sum: %d", name, sumOfTransaction));
            Thread.sleep(2000);

            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
