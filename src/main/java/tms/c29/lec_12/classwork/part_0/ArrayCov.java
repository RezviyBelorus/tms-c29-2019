package tms.c29.lec_12.classwork.part_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCov {
    public static void main(String[] args) {
        String[] strings = {"A", "B"};
        Object[] objects = {};
        objects = strings;
        objects[0] = 1;

        System.out.println(Arrays.toString(objects));

        List<Integer> integers = new ArrayList<>();
        integers.add(1);

        List<? extends Number> numbers = new ArrayList<>();
        numbers = integers;
//        numbers.add(1);
        numbers.add(null);
        Number number = numbers.get(0);

        List<Object> objects1 = new ArrayList<>();
        List<? super Number> wildSuper = objects1;
        Object object = wildSuper.get(0);
        wildSuper.add(1);

        // PECS - producer extends, consumer super

    }

    private static <T extends Number> void show(List<T> list) {
        System.out.println(list);
    }

    private static void showWild(List<? extends Number> list) {
        System.out.println(list);
    }
}
