package test;
import org.junit.jupiter.api.Test;
import src.MedianFinder;

import static org.junit.jupiter.api.Assertions.*;

public class MedianFinderTest {

    @Test
    void testSingleElement() {
        assertEquals(10.7, MedianFinder.findMedian(new double[]{10.7}));
    }

    @Test
    void testOddCountArray() {
        assertEquals(2.0, MedianFinder.findMedian(new double[]{1.0, 2.0, 3.0}));
    }

    @Test
    void testEvenCountArray() {
        assertEquals(30.4, MedianFinder.findMedian(new double[]{17.4, 21.1, 39.7, 48.0}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-384.0, MedianFinder.findMedian(new double[]{-957.0, -493.0, -384.0, -268.0, -131.0}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1.0, MedianFinder.findMedian(new double[]{}));
    }
}
