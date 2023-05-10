package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array) {

        int point = 0;

        for (int i = point; i < array.length - 1; i++) {

            int min = array[point];
            int index = 0;

            for (int j = point; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }
            }

            for (int k = 0; k < array.length; k++) {
                if (array[k] == min) {
                    index = k;
                }
            }

            int helper = array[point];
            array[point] = array[index];
            array[index] = helper;

            point += 1;

        }
        System.out.println(Arrays.toString(array));
    }
}
