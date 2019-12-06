package tms.c29.lec_11.classwork.point_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(3);

        System.out.println(integers);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }

        ListIterator<Integer> listIterator = integers.listIterator();

        System.out.println(integers);

    }
}
