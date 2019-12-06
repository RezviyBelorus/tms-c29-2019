package tms.c29.lec_16.classwork.point_6;

public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        FruitStore fruitStore = new FruitStore();
        int n = 1000_0;

        Runnable producer = () -> {
            for (int i = 0; i < n; i++) {
                fruitStore.put();
            }
        };

        Runnable consumer = () -> {
            for (int i = 0; i < n; i++) {
                fruitStore.get();
            }
        };

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        System.out.println("Number of fruits: " + fruitStore.getNumberOfFruits());
    }
}

class FruitStore {
    private static final int MAX_FRUITS = 500;

    private int numberOfFruits;

    public synchronized void put() {
        while (numberOfFruits >= MAX_FRUITS) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberOfFruits++;
        System.out.println("put: " + numberOfFruits);

        notify();
    }

    public synchronized void get() {
        while (numberOfFruits < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        numberOfFruits--;
        System.out.println("get: " + numberOfFruits);

        notify();
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }
}