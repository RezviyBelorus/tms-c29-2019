package tms.c29.lec_13.prepare.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 1000));
        phones.add(new Phone("3310", "Nokia", 1000));

        Optional<Phone> first = phones.stream()
            .filter(phone -> phone.getPrice() == 1000)
            .findFirst();

        Optional<Phone> any = phones.stream()
            .filter(phone -> phone.getPrice() == 1000)
            .findAny();

        System.out.println(first.get());
        System.out.println(any.get());
    }
}
