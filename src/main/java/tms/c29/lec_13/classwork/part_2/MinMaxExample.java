package tms.c29.lec_13.classwork.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        Optional<Phone> min = phones.stream().min(Comparator.comparing(Phone::getPrice));
        System.out.println(min.get());

        Optional<Phone> max = phones.stream().max(Comparator.comparing(Phone::getPrice));
        System.out.println(max.get());

    }
}
