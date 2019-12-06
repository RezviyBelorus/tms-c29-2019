package tms.c29.lec_17.prepare;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int n = 1000_000_0;

        Runnable runnable = () -> {
            for (int i = 0; i < n; i++) {
                counter.increment();
            }
        };

        Thread thread_1 = new Thread(runnable);
        Thread thread_2 = new Thread(runnable);

        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();

        System.out.println(counter.getCount());
    }
}

class Counter {
    private int count;
    private ReentrantLock locker = new ReentrantLock();

    public void increment() {
        locker.lock();

        count++;

        locker.unlock();
    }

    public int getCount() {
        return count;
    }
}
