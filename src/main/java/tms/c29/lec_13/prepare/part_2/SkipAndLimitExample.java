package tms.c29.lec_13.prepare.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        List<Integer> subList = integers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(subList);
    }
}
