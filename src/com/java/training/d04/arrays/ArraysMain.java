package com.java.training.d04.arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array.length);

        array[3] = 6;
        for (int i : array) {
            System.out.println(i);
        }

        Arrays.sort(array);

        String[] strings = new String[] {"first", "second"};
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }

        String[] nonInitializedValues = new String[10];
        System.out.println("-----------------------------------");

        int[][] matrix = new int[3][3];
        matrix[0][1] = 20;
        matrix[2][1] = 6;
        for (int[] values : matrix) {
            for (int value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
