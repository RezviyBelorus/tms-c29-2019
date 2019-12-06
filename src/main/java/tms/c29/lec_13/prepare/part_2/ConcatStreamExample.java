package tms.c29.lec_13.prepare.part_2;

import tms.c29.lec_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreamExample {
    public static void main(String[] args) {
        List<Phone> phones1 = new ArrayList<>();
        phones1.add(new Phone("Xs", "Apple", 200));
        phones1.add(new Phone("8", "Apple", 400));
        phones1.add(new Phone("S10", "Samsung", 350));
        phones1.add(new Phone("3310", "Nokia", 1000));


        List<Phone> phones2 = new ArrayList<>();
        phones2.add(new Phone("Xs", "Apple", 200));
        phones2.add(new Phone("8", "Apple", 400));
        phones2.add(new Phone("S10", "Samsung", 350));
        phones2.add(new Phone("3310", "Nokia", 1000));

        Stream<Phone> phone_1_Stream = phones1.stream();
        Stream<Phone> phone_2_Stream = phones2.stream();

        Stream<Phone> summaryStream = Stream.concat(phone_1_Stream, phone_2_Stream);

        List<Phone> collect = summaryStream.collect(Collectors.toList());


    }
}
