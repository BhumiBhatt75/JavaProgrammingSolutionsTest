package test;

import src.SecondLargestFinder;

public class SecondLargestFinderTest {

    public static void main(String[] args) {
        testWithNormalCase();
        testWithDuplicates();
        testWithAllSame();
    }

    public static void testWithNormalCase() {
        int[] arr = {12, 45, 67, 23, 89, 34};
        assert SecondLargestFinder.findSecondLargest(arr) == 67 : "Test failed: Normal case";
        System.out.println("Test passed: Normal case");
    }

    public static void testWithDuplicates() {
        int[] arr = {50, 20, 50, 10};
        assert SecondLargestFinder.findSecondLargest(arr) == 20 : "Test failed: With duplicates";
        System.out.println("Test passed: With duplicates");
    }

    public static void testWithAllSame() {
        try {
            int[] arr = {5, 5, 5, 5};
            SecondLargestFinder.findSecondLargest(arr);
            System.out.println("Test failed: All elements same");
        } catch (RuntimeException e) {
            System.out.println("Test passed: All elements same - " + e.getMessage());
        }
    }
}
