package tms.c29.lec_17.classwork.point_1;

public class DeadLockExample {
    public static Object LOCK_1 = new Object();
    public static Object LOCK_2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();

    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 locks LOCK_1");
        synchronized (DeadLockExample.LOCK_1) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[Thread_1] Trying to lock LOCK_2");
            synchronized (DeadLockExample.LOCK_2) {
                System.out.println("[Thread_1] LOCK_2 locked");
            }
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2 locks LOCK_2");
        synchronized (DeadLockExample.LOCK_2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[Thread_2] Trying to lock LOCK_1");
            synchronized (DeadLockExample.LOCK_1) {
                System.out.println("[Thread_2] LOCK_1 locked");
            }
        }
    }
}
