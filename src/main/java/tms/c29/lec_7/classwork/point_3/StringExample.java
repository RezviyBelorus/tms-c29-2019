package tms.c29.lec_7.classwork.point_3;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String name = "Olga";
        name.concat("Vladimirovna");

        String name_2 = "Olga";
        String name_3 = new String("OlgO");

        System.out.println(name == name_2);
        System.out.println(name.equals(name_3));

        name_3 = name_3.intern();
        System.out.println(name == name_3);

        System.out.println(name_3.charAt(0));
        System.out.println(name_3.contains("lg"));
        System.out.println(name_3.replace("Ol", "Ihaaaa"));
        System.out.println(name_3.replaceAll("O", "Ihaaaa"));
        String words = "apple, banana, car, name";
        String[] split = words.split(", ");
        System.out.println(Arrays.toString(split));

        System.out.println("Pineapple".substring(3));
        System.out.println("Pineapple".substring(4, 7));


    }
}
