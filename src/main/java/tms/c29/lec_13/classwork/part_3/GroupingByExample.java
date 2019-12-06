package tms.c29.lec_13.classwork.part_3;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        Map<String, List<Phone>> collect = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer));

        Set<Map.Entry<String, List<Phone>>> entries = collect.entrySet();
        for (Map.Entry<String, List<Phone>> entry : entries) {
            System.out.println(entry);
        }

        Map<String, Long> producersAndCount = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer, Collectors.counting()));

        for (Map.Entry<String, Long> stringLongEntry : producersAndCount.entrySet()) {
            System.out.println(stringLongEntry);
        }

        Map<String, IntSummaryStatistics> producersAndTotalPrice = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer, Collectors.summarizingInt(Phone::getPrice)));

        for (Map.Entry<String, IntSummaryStatistics> entry : producersAndTotalPrice.entrySet()) {
            System.out.println(entry);
            System.out.println("count = " + entry.getValue().getCount());
            System.out.println("min = " + entry.getValue().getMin());
            System.out.println("max = " + entry.getValue().getMax());
        }
    }
}
