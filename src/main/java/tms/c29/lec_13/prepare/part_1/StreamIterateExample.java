package tms.c29.lec_13.prepare.part_1;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

        }

        Optional<Integer> max = Stream.iterate(0, n -> n++)
                .limit(10)
                .max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println(max.get());
        }

        System.out.println("After Optional.get()");
    }
}
