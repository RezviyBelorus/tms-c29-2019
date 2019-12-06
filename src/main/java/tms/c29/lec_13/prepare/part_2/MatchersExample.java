package tms.c29.lec_13.prepare.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class MatchersExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        boolean anyMatch = phones.stream()
            .anyMatch(p -> "Apple".equals(p.getProducer()));
        System.out.println("anyMatch =" + anyMatch);

        boolean allMatch = phones.stream()
            .allMatch(p -> "Apple".equals(p.getProducer()));
        System.out.println("allMatch =" + allMatch);

        boolean noneMatch = phones.stream()
            .noneMatch(p -> "Xiaomi".equals(p.getProducer()));
        System.out.println("noneMatch =" + noneMatch);
    }
}
