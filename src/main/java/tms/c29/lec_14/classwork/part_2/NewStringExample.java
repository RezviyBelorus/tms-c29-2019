package tms.c29.lec_14.classwork.part_2;

import java.util.Optional;

public class NewStringExample {
    public static void main(String[] args) {
        String string = "   Hello from java  ";

        System.out.println(string);
        System.out.println(string.strip());
        System.out.println(string.stripLeading());
        System.out.println(string.stripTrailing());

        System.out.println(string.repeat(4));

        Integer x = null;

        Optional<Integer> x1 = Optional.of(x);


    }
}
