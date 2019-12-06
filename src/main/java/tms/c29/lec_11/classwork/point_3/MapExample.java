package tms.c29.lec_11.classwork.point_3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Student, Integer> map = new HashMap<>();
        final Student alex = new Student("Alex", 33);

        map.put(alex, 22);

        Integer integer = map.get(alex);
        System.out.println("Before = " + integer);

        alex.setName("Egorka");

        Integer newValue = map.get(alex);
        System.out.println("After = " + newValue);

        System.out.println("Whole map: ");
        System.out.println(map);

        map.put(null, null);
        System.out.println(map);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 22);
        treeMap.put("A", 21);
        treeMap.put("D", 23);
        treeMap.put("C", null);
        System.out.println(treeMap);
    }
}
