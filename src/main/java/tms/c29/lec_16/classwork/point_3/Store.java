package tms.c29.lec_16.classwork.point_3;

public class Store {
    private int x;
    private Object syncObject = new Object();

    public synchronized void increment() {
        x++;
    }

    public synchronized void incrementSyncBlockV1() {
        x++;
    }

    public void incrementSyncBlockV2() {
        synchronized (syncObject) {
            x++;
        }
    }

    public void incrementSyncBlockV3() {
        synchronized (syncObject) {
            x++;
        }
    }

    public int getX() {
        return x;
    }
}

class ValueIncrementor implements Runnable {
    private Store store;

    public ValueIncrementor(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000_000_0; i++) {
            store.incrementSyncBlockV1();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();

        ValueIncrementor valueIncrementor = new ValueIncrementor(store);

        Runnable runnable_2 = () -> {
            for (int i = 0; i < 1000_000_0; i++) {
                store.incrementSyncBlockV2();
            }
        };

        Runnable runnable_3 = () -> {
            for (int i = 0; i < 1000_000_0; i++) {
                store.incrementSyncBlockV3();
            }
        };

        Thread thread_1 = new Thread(valueIncrementor);
        Thread thread_2 = new Thread(runnable_2);
        Thread thread_3 = new Thread(runnable_3);

        thread_1.start();
        thread_2.start();
        thread_3.start();

        thread_1.join();
        thread_2.join();
        thread_3.join();

        System.out.println(store.getX());
    }
}