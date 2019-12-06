package tms.c29.lec_17.practice;

import java.util.concurrent.Exchanger;

public class ExchangerExample implements Runnable {
    private Exchanger<String> ex;
    private String name;

    public ExchangerExample(Exchanger<String> ex, String name) {
        this.ex = ex;
        this.name = name;
    }

    @Override
    public void run() {
        try {
             ex.exchange("Hello from " + this.name);
            Thread.sleep(2000);
//            System.out.println(exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        ExchangerExample exchangerExample = new ExchangerExample(ex, "Java");
        ExchangerExample exchangerExample_1 = new ExchangerExample(ex, "Alex");
        ExchangerExample exchangerExample_2 = new ExchangerExample(ex, "Moron");
        ExchangerExample exchangerExample_3 = new ExchangerExample(ex, "sam takoi");

        new Thread(exchangerExample).start();
        new Thread(exchangerExample_1).start();
        new Thread(exchangerExample_2).start();
//        new Thread(exchangerExample_3).start();
    }
}
