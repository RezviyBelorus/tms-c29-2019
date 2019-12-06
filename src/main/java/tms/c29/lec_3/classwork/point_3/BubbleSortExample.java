package tms.c29.lec_3.classwork.point_3;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arrayToSort = {1,0};
        System.out.println(Arrays.toString(arrayToSort));

        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[i - 1]) {
                    swap(arrayToSort, i, i - 1);
                    needToSort = true;
                }
            }
        }

        System.out.println(Arrays.toString(arrayToSort));
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }
}
