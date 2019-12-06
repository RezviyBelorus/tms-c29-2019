package tms.c29.lec_13.classwork.part_1;

import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        }

        Stream<Integer> limit = Stream.iterate(0, n -> ++n)
            .limit(10);

        long totalCount = limit.count();

        limit.forEach(System.out::println);
    }
}
