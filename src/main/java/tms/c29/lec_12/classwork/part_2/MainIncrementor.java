package tms.c29.lec_12.classwork.part_2;

import java.util.function.UnaryOperator;

public class MainIncrementor {
    public static void main(String[] args) {
        Incrementor incrementor = integer -> ++integer;

        PredicateInterface predicate = integer -> integer % 2 == 0;

        Incrementor heavyIncrementor = integer -> {
            if (predicate.test(integer)) {
                return integer + 2;
            } else {
                return integer * 2;
            }
        };
        int x  = 0;

        int result = increment(incrementor, x);
        System.out.println("result = " + result);

        int heavyResult = increment(heavyIncrementor, x);
        System.out.println("heavyResult = " + heavyResult);
    }

    private static int increment(Incrementor incrementor, int value) {
        return incrementor.increment(value);
    }
}
