package tms.c29.lec_14.classwork.part_1;

import java.util.ArrayList;
import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        var varStrings = new ArrayList<String>();
        varStrings.add("A");

        show(varStrings);
    }

    private static void show(List<String> strings) {
        System.out.println(strings);
    }
}
