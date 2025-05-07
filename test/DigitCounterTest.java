package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import src.DigitCounter;



/**
 * Unit tests for DigitCounter.
 */
public class DigitCounterTest {

    @Test
    public void testPositiveNumber() {
        assertEquals(2, DigitCounter.countDigits(34));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(4, DigitCounter.countDigits(-7291));
    }

    @Test
    public void testZero() {
        assertEquals(1, DigitCounter.countDigits(0));
    }

    @Test
    public void testLargeNumber() {
        assertEquals(10, DigitCounter.countDigits(1234567890));
    }

    @Test
    public void testSingleDigit() {
        assertEquals(1, DigitCounter.countDigits(7));
    }
}
