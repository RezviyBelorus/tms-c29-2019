package tms.c29.lec_13.prepare.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        Set<String> producers = phones.stream()
            .map(Phone::getProducer)
            .collect(Collectors.toSet());

        System.out.println(producers);
    }
}
