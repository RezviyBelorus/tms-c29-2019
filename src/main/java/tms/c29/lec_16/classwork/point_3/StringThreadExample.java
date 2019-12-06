package tms.c29.lec_16.classwork.point_3;

public class StringThreadExample {
    public static void main(String[] args) throws InterruptedException {
        StringChanger stringChanger = new StringChanger();

        String text = " ";

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                stringChanger.addStringSpace();
                stringChanger.addBuilderSpace();
                stringChanger.addBufferSpace();
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println("String: " + stringChanger.getName().length());
        System.out.println("StringBuilder: " + stringChanger.getStringBuilder().length());
        System.out.println("StringBuffer: " + stringChanger.getStringBuffer().length());
    }
}
