package tms.c29;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadedList<T> {
    private List<T> list;

    private ReentrantLock locker;

    public MultithreadedList() {
        // нету особо смысла в таком конструкторе, можно сразу в месте объявления поля делать инициализацию
        list = new ArrayList<>();
        locker = new ReentrantLock();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T element) {
        if (locker.tryLock()) {
            try {
                list.add(element);
            } finally {
                locker.unlock(); // не получала IllegalMonitorStateException? если вызвать unlock() у незалоченного объекта
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultithreadedList<String> list = new MultithreadedList<>();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                list.add("abc");
            }
        };

        Thread thread = new Thread(runnable);
        Thread anotherThread = new Thread(runnable);

        thread.start();
        anotherThread.start();

        thread.join();
        anotherThread.join();

        System.out.println(list.getList().size());
    }
}