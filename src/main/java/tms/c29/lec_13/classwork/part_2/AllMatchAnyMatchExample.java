package tms.c29.lec_13.classwork.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class AllMatchAnyMatchExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        boolean allMatch = phones.stream().allMatch(phone -> phone.getPrice() > 300);
        System.out.println(allMatch);

        boolean anyMatch = phones.stream().anyMatch(phone -> phone.getPrice() > 300);
        System.out.println(anyMatch);

    }
}
