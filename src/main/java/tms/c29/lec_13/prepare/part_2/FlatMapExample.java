package tms.c29.lec_13.prepare.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        String vasya = String.format("Hello, %s", "Vasya");
        System.out.println(vasya);
        phones.stream()
            .flatMap(phone -> Stream.of(
                String.format("Normal price for %s %s is %d", phone.getProducer(), phone.getModel(), phone.getPrice()),
                String.format("Sale price for %s %s is %d \n", phone.getProducer(), phone.getModel(), (int) (phone.getPrice() * 0.9))
            ))
            .forEach(System.out::println);

        long count = phones.stream()
            .flatMap(phone -> Stream.of(
                String.format("Normal price for %s %s is %d", phone.getProducer(), phone.getModel(), phone.getPrice()),
                String.format("Sale price for %s %s is %d \n", phone.getProducer(), phone.getModel(), (int) (phone.getPrice() * 0.9))
            ))
            .count();


        System.out.println("count = " + count);
    }
}
