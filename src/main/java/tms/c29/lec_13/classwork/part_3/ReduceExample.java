package tms.c29.lec_13.classwork.part_3;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        Optional<Integer> sum = integers.stream().reduce((x, y) -> x + y);
        System.out.println(sum.get());

        Integer reduce = integers.stream().reduce(10, (x, y) -> x + y);
        System.out.println(reduce);


        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        Optional<Integer> totalPrice = phones.stream()
            .map(Phone::getPrice)
            .reduce((price1, price2) -> price1 + price2);
        System.out.println("total price = " + totalPrice.get());

        Integer totalReducedPrice = phones.stream()
            .reduce(0,
                (x, y) -> {
                    if (y.getPrice() > 350) {
                        return x + y.getPrice();
                    } else {
                        return x;
                    }
                },
                (x, y) -> x + y);

        System.out.println(totalReducedPrice);

        Optional<Integer> ezReadReducer = phones.stream()
            .map(phone -> phone.getPrice())
            .filter(integer -> integer > 350)
            .reduce((x, y) -> x + y);

        System.out.println(ezReadReducer);


    }
}
