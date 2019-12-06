package tms.c29.lec_13.prepare.part_3;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        Map<Boolean, List<Phone>> collect = phones.stream()
                .collect(Collectors.partitioningBy(phone -> "Samsung".equalsIgnoreCase(phone.getProducer())));

        System.out.println(collect);
    }
}
