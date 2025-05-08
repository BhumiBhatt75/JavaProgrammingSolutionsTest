package test;

import src.InflationCalculator;

public class InflationCalculatorTest {

    public static void main(String[] args) {
        testCompoundedInflation();
    }

    public static void testCompoundedInflation() {
        double result = InflationCalculator.calculateCompoundedInflation(20, 5);
        double expected = 149.0;
        if (Math.abs(result - expected) < 0.5) {
            System.out.println("Test passed.");
        } else {
            System.out.printf("Test failed. Expected %.2f but got %.2f%n", expected, result);
        }
    }
}
