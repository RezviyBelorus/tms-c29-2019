package tms.c29.lec_13.prepare.part_3;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("8", "Apple", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));

        Set<Phone> collect = phones.stream()
            .collect(Collectors.toSet());

        Map<String, List<Phone>> groupedByProducer = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer));
        System.out.println("groupedByProducer = " + groupedByProducer);

        Map<String, Long> countByProducer = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer, Collectors.counting()));
        System.out.println("countByProducer = " + countByProducer);

        Map<String, Integer> totalPriceByProducer = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer, Collectors.summingInt(Phone::getPrice)));
        System.out.println("totalPriceByProducer = " + totalPriceByProducer);

        Map<String, IntSummaryStatistics> summaryStatisticsMap = phones.stream()
            .collect(Collectors.groupingBy(Phone::getProducer, Collectors.summarizingInt(Phone::getPrice)));

        summaryStatisticsMap.entrySet().forEach(entry -> {
            String key = entry.getKey();
            IntSummaryStatistics value = entry.getValue();
            double average = value.getAverage();

            System.out.println("\nproducer = " + key);
            System.out.println("average = " + average);
        });
    }
}
