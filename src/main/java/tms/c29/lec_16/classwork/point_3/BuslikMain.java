package tms.c29.lec_16.classwork.point_3;

public class BuslikMain {
    public static void main(String[] args) throws InterruptedException {
        BuslikStore buslikStore = new BuslikStore();

        int iter = 1000_00;

        Runnable runnable = () -> {
            for (int i = 0; i < iter; i++) {
                buslikStore.putToy();
            }
        };

        Runnable runnableSyncBlock = () -> {
            for (int i = 0; i < iter; i++) {
                buslikStore.putToySyncBlock();
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnableSyncBlock);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Number of toys: " + buslikStore.getNumberOfToys());
    }
}
