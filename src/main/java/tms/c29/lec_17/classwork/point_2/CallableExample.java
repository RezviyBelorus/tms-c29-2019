package tms.c29.lec_17.classwork.point_2;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1_000);

        return "Hello from callable";
    }
}
