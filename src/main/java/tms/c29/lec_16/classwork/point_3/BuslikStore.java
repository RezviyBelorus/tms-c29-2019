package tms.c29.lec_16.classwork.point_3;

import java.util.ArrayList;
import java.util.List;

public class BuslikStore {
    private int numberOfToys;

    private List<String> strings = new ArrayList<>();

    private Object object = new Object();
    private Object object_2 = new Object();

    public void putToySyncBlock() {
        synchronized (this) {
            numberOfToys++;
        }
    }

    public synchronized void putToy() {
//            System.out.println(Thread.currentThread().getName());
            numberOfToys++;
    }

    public int getNumberOfToys() {
        return numberOfToys;
    }

    public synchronized void addSyncBlock_2() {
        synchronized (object) {
            strings.add("");
        }
    }

    public synchronized void addSyncBlock() {
        synchronized (object) {
            strings.add("");
        }
    }
}
