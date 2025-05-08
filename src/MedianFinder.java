package src;

import java.util.Scanner;

import java.util.Arrays;

public class MedianFinder {
    /**
     * Returns the median of a sorted array.
     * If the array is empty, returns -1.0.
     */
    public static double findMedian(double[] array) {
        if (array == null || array.length == 0) {
            return -1.0;
        }

        int n = array.length;
        if (n % 2 == 1) {
            // Odd length → return middle element
            return array[n / 2];
        } else {
            // Even length → return average of two middle elements
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        }
    }

    // Optional: Print method for demonstration
    public static void main(String[] args) {
        double[][] testArrays = {
            {10.7},
            {1.0, 2.0, 3.0},
            {17.4, 21.1, 39.7, 48.0},
            {-957.0, -493.0, -384.0, -268.0, -131.0},
            {}
        };

        for (double[] arr : testArrays) {
            System.out.println("Median: " + findMedian(arr));
        }
    }
}
