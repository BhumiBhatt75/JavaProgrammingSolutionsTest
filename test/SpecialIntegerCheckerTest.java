package test;

import src.SpecialIntegerChecker;

public class SpecialIntegerCheckerTest {

    public static void main(String[] args) {
        testIsSpecialInteger();
    }

    public static void testIsSpecialInteger() {
        int[] specialNumbers = {19, 29, 39, 49, 59, 69, 79, 89};
        for (int number : specialNumbers) {
            if (!SpecialIntegerChecker.isSpecialInteger(number)) {
                System.out.println("Test failed for: " + number);
                return;
            }
        }

        if (SpecialIntegerChecker.isSpecialInteger(10)) {
            System.out.println("Test failed for: 10 (should NOT be special)");
            return;
        }

        System.out.println("All tests passed.");
    }
}
