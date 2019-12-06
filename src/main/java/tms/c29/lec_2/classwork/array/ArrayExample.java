package tms.c29.lec_2.classwork.array;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println(Arrays.toString(array));


        int index = 0;
        double[] doubles = new double[10];

        while (index < doubles.length) {
            doubles[index] = Math.random();
            index++;
        }

        System.out.println(Arrays.toString(doubles));


        String[] strings = new String[10];
        System.out.println(Arrays.toString(strings));
    }
}
