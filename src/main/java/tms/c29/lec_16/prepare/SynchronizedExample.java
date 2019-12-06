package tms.c29.lec_16.prepare;

public class SynchronizedExample {
    private int x;

    public synchronized void increment() {
        x++;
    }

    public void incrementSyncClass() {
        synchronized (SynchronizedExample.class) {
            x++;
        }
    }

    public void incrementSyncThis() {
        synchronized (this) {
            x++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();

        int n = 1000_00;

        Runnable runnable_1 = () -> {
            for (int i = 0; i < n; i++) {
                example.incrementSyncThis();
            }
        };
        Runnable runnable_2 = () -> {
            for (int i = 0; i < n; i++) {
                example.incrementSyncClass();
            }
        };

        Thread thread_1 = new Thread(runnable_1);
        Thread thread_2 = new Thread(runnable_2);

        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();

        System.out.println(example.x);

    }
}
