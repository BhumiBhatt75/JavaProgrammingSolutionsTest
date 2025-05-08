package test;

import src.TimeConverter;

public class TimeConverterTest {

    public static void main(String[] args) {
        testConvertSeconds();
    }

    public static void testConvertSeconds() {
        String result = TimeConverter.convertSeconds(21893872);
        String expected = "253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)";
        if (result.equals(expected)) {
            System.out.println("Test passed.");
        } else {
            System.out.printf("Test failed. Expected: \"%s\" but got: \"%s\"%n", expected, result);
        }
    }
}
