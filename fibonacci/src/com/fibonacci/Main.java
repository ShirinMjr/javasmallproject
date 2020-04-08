package com.fibonacci;

/**
 * Write code to display the first 10 numbers of the fibonacci series.
 * (For example, the first few numbers are 1, 2, 3, 5, 8, 13, ...)
 */
public class Main {
    public static void main(String[] args) {
        final int seriesNum = 10;
        int[] fibonacci = new int[seriesNum];
        fibonacci[0] = 1;
        fibonacci[1] = 2;

        for (int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}

