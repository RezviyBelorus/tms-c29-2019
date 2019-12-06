package tms.c29.lec_13.classwork.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("S10", "Samsung", 150));
        phones.add(new Phone("3310", "Nokia", 1000));

        Optional<Phone> ff = phones.stream()
            .filter(phone -> phone.getModel().equals("S10"))
            .findFirst();

        System.out.println(ff.get());

        Optional<Phone> fa = phones.stream()
            .filter(phone -> phone.getModel().equals("S10"))
            .findAny();

        System.out.println(fa.get());

    }
}
