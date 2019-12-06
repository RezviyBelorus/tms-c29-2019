package tms.c29.lec_13.prepare.part_3;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.of(1);

        if (integer.isPresent()) {
            System.out.println(integer.get());
        }

        Integer integer1 = integer.orElse(3);
        System.out.println("integer1 = " + integer1);

    }
}
