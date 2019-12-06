package tms.c29.lec_17.classwork.point_7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Garage {
    private List<String> cars = new ArrayList<>();

    private ReentrantLock locker = new ReentrantLock();

    public void park(String number) {
        try {
            boolean isLocked = locker.tryLock(Integer.valueOf(number), TimeUnit.MILLISECONDS);
            if (isLocked) {
                cars.add(number);
                System.out.println(number);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    public List<String> getCars() {
        return cars;
    }
}
