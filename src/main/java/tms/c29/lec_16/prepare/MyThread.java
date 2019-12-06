package tms.c29.lec_16.prepare;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(1000);
                System.out.printf("%s thread working...\n", Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main working");

        MyThread myThread = new MyThread("MyThread");
        myThread.start();

        Thread.sleep(2000);
//        myThread.join();

        myThread.interrupt();


        System.out.println("Main finished");
    }
}
