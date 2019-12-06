package tms.c29.lec_13.prepare.part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntStreamExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Stream<Integer> stream = integers.stream();

        long count = stream.count();
        System.out.println(count);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        long integerStreamElemCount = integerStream.filter(elem -> elem > 3).count();
        System.out.println(integerStreamElemCount);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        int counter = 0;
        for (Integer integer : integerList) {
            if (integer > 3) {
                counter++;
            }
        }
    }
}
