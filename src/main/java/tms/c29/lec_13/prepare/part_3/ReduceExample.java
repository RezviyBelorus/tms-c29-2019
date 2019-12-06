package tms.c29.lec_13.prepare.part_3;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        Optional<Integer> result = integers.stream()
            .reduce((x, y) -> x * y);

        System.out.println(result.get());

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));


        Integer sum = phones.stream()
            .reduce(0,
                (x, y) -> {
                    if (y.getPrice() < 500) {
                        return x + y.getPrice();
                    } else {
                        return x;
                    }
                },
                (x, y) -> x + y
            );
        System.out.println(sum);

        Optional<Integer> reducedByPrice = phones.stream()
            .map(Phone::getPrice)
            .filter(price -> price < 500)
            .reduce((x, y) -> x + y);

        System.out.println(reducedByPrice.get());

        int intSum = 0;
        for (Phone phone : phones) {
            int price = phone.getPrice();
            if (price < 500) {
                intSum += price;
            }
        }

    }
}
