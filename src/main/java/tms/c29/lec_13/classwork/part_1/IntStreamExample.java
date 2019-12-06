package tms.c29.lec_13.classwork.part_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntStreamExample {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        long count = integerStream
            .filter(integer -> integer > 1)
            .count();

        System.out.println("count = " + count);

        List<Integer> integers = Arrays.asList(1, 2, 3);

        int counter = 0;
        for (Integer integer : integers) {
            if (integer > 1) {
                counter++;
            }
        }

        long count1 = integers.parallelStream()
            .filter(integer -> integer > 1)
            .count();

        System.out.println(integers);

    }

}
