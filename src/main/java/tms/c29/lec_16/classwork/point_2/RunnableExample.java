package tms.c29.lec_16.classwork.point_2;

public class RunnableExample implements Runnable {
    private String threadName;
    private int iterationCount;

    public RunnableExample(String threadName, int iterationCount) {
        this.threadName = threadName;
        this.iterationCount = iterationCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterationCount; i++) {
            System.out.printf("Hello from %s: %d \n", this.threadName, i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableExample runnableExampleThread = new RunnableExample("RunnableExampleThread", 5);

        Thread thread = new Thread(runnableExampleThread);
        Thread thread_2 = new Thread(runnableExampleThread);

        thread.start();
        thread_2.start();
        thread.join();
        thread_2.join();


        System.out.println("Main finished");

    }
}
