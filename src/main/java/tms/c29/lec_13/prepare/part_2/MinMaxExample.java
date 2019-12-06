package tms.c29.lec_13.prepare.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(33, 22, 99, 44);

        Optional<Integer> max = integers.stream()
            .max(Integer::compareTo);

        System.out.println(max.get());

        Optional<Integer> min = integers.stream()
            .min(Integer::compareTo);
        System.out.println(min.get());
    }
}
