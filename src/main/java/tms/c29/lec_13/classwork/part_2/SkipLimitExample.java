package tms.c29.lec_13.classwork.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        List<Phone> collect = phones.stream()
            .skip(2)
            .limit(2)
            .collect(Collectors.toList());

        System.out.println(collect);
    }
}
