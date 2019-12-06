package tms.c29.lec_11.classwork.point_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(44);
        strings.add("A");
        strings.add(0, "B");
        strings.add("C");
        System.out.println(strings);
        strings.set(0, "new B");
        System.out.println(strings);
        System.out.println("size = " + strings.size());

        List<String> ll = new LinkedList<>();
        ll.addAll(strings);
        ll.add("A");
        System.out.println(ll);
        ll.removeAll(Arrays.asList("A", "B"));
        System.out.println(ll);


        List<String> a = Collections.singletonList("A");
        a.add("2");

    }
}
