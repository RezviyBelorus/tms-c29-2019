package tms.c29.lec_11.practice.task_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitsExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("A");
        strings.add("C");
        strings.add("B");

        Map<String, Integer> warehouse = new HashMap<>();

        for (String string : strings) {
            if (warehouse.containsKey(string)) {
                Integer integer = warehouse.get(string);
                warehouse.put(string, ++integer);
            } else {
                warehouse.put(string, 1);
            }
        }
    }

}
