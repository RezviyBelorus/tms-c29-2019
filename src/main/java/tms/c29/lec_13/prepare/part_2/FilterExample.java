package tms.c29.lec_13.prepare.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    private static final String APPLE = "Apple";

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        List<Phone> filteredByProducer = phones.stream()
            .filter(phone -> APPLE.equals(phone.getProducer()))
            .collect(Collectors.toList());

        System.out.println(phones);
        System.out.println("== filtered ==");
        System.out.println(filteredByProducer);


        List<Phone> filteredByPrice = phones.stream()
            .filter(phone -> phone.getPrice() > 500)
            .collect(Collectors.toList());

        System.out.println(filteredByPrice);
    }
}
