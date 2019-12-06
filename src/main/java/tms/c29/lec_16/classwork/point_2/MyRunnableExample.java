package tms.c29.lec_16.classwork.point_2;

public class MyRunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new MyRunnableThread();

        Thread thread = new Thread(runnable);

        Runnable superMegaLambda = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ": " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Finished: " + name);
        };

        Thread superMegaLambdaThread = new Thread(superMegaLambda);

        thread.start();
        superMegaLambdaThread.start();

        thread.join();
        superMegaLambdaThread.join();

        int i = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of processors: " + i);
        System.out.println(Thread.currentThread().getName());
    }
}
