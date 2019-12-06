package tms.c29.lec_16.classwork.point_1;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Hello from %s \n", super.getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from main");

        MyThread myThread = new MyThread("MyThread");
        myThread.start();

        System.out.println("isAlive:" + myThread.isAlive());

        myThread.join();

        System.out.println("isAlive:" + myThread.isAlive());
        System.out.println("Main finished");
    }
}
