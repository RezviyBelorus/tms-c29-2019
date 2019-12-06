package tms.c29.lec_17.classwork.point_4;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        Bank prior = new Bank("Prior", semaphore, 1000_000);
        Bank mtb = new Bank("MTB", semaphore, 100);
        Bank belarusBank = new Bank("BelarusBank", semaphore, 1000);

        new Thread(prior).start();
        new Thread(mtb).start();
        new Thread(belarusBank).start();
    }
}
