package tms.c29.lec_16.classwork.point_1;

public class MyThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        String name = thread.getName();

        ParallelThread parallelThread = new ParallelThread("parallel thread");
        parallelThread.start();

        parallelThread.join();

        System.out.println("Finished: " + name);
    }
}
