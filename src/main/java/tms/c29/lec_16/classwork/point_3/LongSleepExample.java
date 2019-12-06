package tms.c29.lec_16.classwork.point_3;

public class LongSleepExample {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();

        Runnable runnable = () -> {
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("After object");
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Main finished");
    }
}
