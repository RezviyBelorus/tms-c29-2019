package tms.c29.lec_17.classwork.point_5;

import java.util.concurrent.CountDownLatch;

public class Racer implements Runnable {
    private String name;
    private CountDownLatch countDownLatch;

    public Racer(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.countDown();
            System.out.println(String.format("[%s] racer waiting!", name));
            countDownLatch.await();
            System.out.println(String.format("[%s] racer moving!", name));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
