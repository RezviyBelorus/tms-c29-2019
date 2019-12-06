package tms.c29.lec_16.prepare.producer_consumer;

import static java.lang.String.format;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer, "producer thread").start();
        new Thread(consumer, "consumer thread").start();
    }
}

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println(format("[%s] Покупатель купил 1 товар", LocalTime.now().format(DateTimeFormatter.ISO_TIME)));
        System.out.println("(GET)Товаров на складе: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println(format("[%s] Производитель добавил 1 товар", LocalTime.now().format(DateTimeFormatter.ISO_TIME)));
        System.out.println("(PUT)Товаров на складе: " + product);
        notify();
    }
}

class Producer implements Runnable {
    Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 20; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 20; i++) {
            store.get();
        }
    }
}