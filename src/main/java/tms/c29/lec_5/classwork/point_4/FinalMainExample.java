package tms.c29.lec_5.classwork.point_4;

import java.util.Arrays;

public class FinalMainExample {
    public static void main(String[] args) {
        Child name = new Child("Name");

        final int x = 12;

        final int[] array = new int[3];
//        array = new int[4];
        System.out.println(Arrays.toString(array));

        array[0] = 66;
        System.out.println(Arrays.toString(array));
    }
}
