package tms.c29.lec_13.classwork.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        phones.stream()
            .flatMap(phone -> Stream.of(
                String.format("Normal price for %s %s is %d", phone.getProducer(), phone.getModel(), phone.getPrice()),
                String.format("Sale price for %s %s is %d \n", phone.getProducer(), phone.getModel(), (int) (phone.getPrice() * 0.9))
            ))
                .forEach(System.out::println);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<List<Integer>> list = new ArrayList<>();
        list.add(integers);
        list.add(Arrays.asList(4,5,6));
        list.add(Arrays.asList(7,8,0));

        Optional<Integer> min = list.stream()
            .flatMap(integerList -> integerList.stream())
            .min(Integer::compareTo);

        System.out.println(min);
    }
}
