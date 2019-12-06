package tms.c29;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int[] arrayOne = {1, 4, 5};
        int[] arrayTwo = {0, 2, 3};
        int[] arrayThree = new int[arrayOne.length + arrayTwo.length];

        int i = 0, j = 0;
        for (int k = 0; k < arrayThree.length; k++) {

            if (i > arrayOne.length - 1) {
                int a = arrayTwo[j];
                arrayThree[k] = a;
                j++;
            } else if (j > arrayTwo.length - 1) {
                int a = arrayOne[i];
                arrayThree[k] = a;
                i++;
            } else if (arrayOne[i] < arrayTwo[j]) {
                int a = arrayOne[i];
                arrayThree[k] = a;
                i++;
            } else {
                int b = arrayTwo[j];
                arrayThree[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(arrayThree));
    }
}