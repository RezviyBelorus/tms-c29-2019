package tms.c29.lec_3.classwork.point_1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] initArray = {0, 4, 5, 2};

        for (int i = 0; i < initArray.length; i++) {
            int elem = initArray[i];
            System.out.println(elem);
        }

        for (int elem : initArray) {
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(initArray));

        int[][] twoDimensionsArray = new int[5][];

        System.out.println("=== twoDimensionsArray ===");
        for (int i = 0; i < twoDimensionsArray.length; i++) {
            twoDimensionsArray[i] = new int[i + 1];
            for (int j = 0; j < twoDimensionsArray[i].length; j++) {
                int elem = twoDimensionsArray[i][j];
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        int[][] array2d = {{1, 1, 1}, {2, 2, 2}};
        for (int i = 0; i < array2d.length; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }
    }
}
