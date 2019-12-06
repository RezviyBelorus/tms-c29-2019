package tms.c29.lec_17.classwork.point_5;

import java.util.concurrent.CountDownLatch;

public class ContDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        for (int i = 0; i < 4; i++) {
            Racer racer = new Racer(String.valueOf(i), latch);
            new Thread(racer).start();
        }

        Thread.sleep(3000);
        System.out.println("Start!");
        latch.countDown();
    }
}
