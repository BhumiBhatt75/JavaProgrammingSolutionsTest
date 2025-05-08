package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.LargerNumber;

/**
 * Unit tests for LargerNumber class.
 */
public class LargerNumberTest {

    @Test
    public void testFirstNumberLarger() {
        // Test when the first number is larger
        assertEquals(10, LargerNumber.findLarger(10, 5));
    }

    @Test
    public void testSecondNumberLarger() {
        // Test when the second number is larger
        assertEquals(15, LargerNumber.findLarger(10, 15));
    }

    @Test
    public void testEqualNumbers() {
        // Test when both numbers are equal
        assertEquals(20, LargerNumber.findLarger(20, 20));
    }

    @Test
    public void testNegativeNumbers() {
        // Test with negative numbers
        assertEquals(-5, LargerNumber.findLarger(-10, -5));
    }

    @Test
    public void testZeroValue() {
        // Test when one number is zero
        assertEquals(0, LargerNumber.findLarger(0, -5));
    }
}
