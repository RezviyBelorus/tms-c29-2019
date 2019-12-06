package tms.c29.lec_13.classwork.part_3;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Integer> sum = sum(1, 2);
        Integer integer = sum.orElse(33);
        System.out.println(integer);

        sum.orElseThrow(NullPointerException::new);

        Optional<Integer> sum1 = sum(100, 200);
        if (sum1.isPresent()) {
            System.out.println(sum1.get());
        }
    }

    private static Optional<Integer> sum(Integer x, Integer y) {
        int sum = x + y;
        if (sum < 100) {
            return Optional.empty();
        }
        return Optional.of(sum);
    }
}
