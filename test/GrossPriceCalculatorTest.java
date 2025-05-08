package test;

import src.GrossPriceCalculator;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class GrossPriceCalculatorTest {

    @Test
    void testCalculateGrossPrice_ValidInputs() {
        assertEquals(new BigDecimal("89.24"),
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("99.95"), new BigDecimal("0.12")));

        assertEquals(new BigDecimal("39061.72"),
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("49999.00"), new BigDecimal("0.28")));

        assertEquals(new BigDecimal("685.71"),
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("720.00"), new BigDecimal("0.05")));

        assertEquals(new BigDecimal("45.00"),
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("45.00"), new BigDecimal("0.00")));
    }

    @Test
    void testCalculateGrossPrice_ZeroTax() {
        assertEquals(new BigDecimal("100.00"),
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("100.00"), BigDecimal.ZERO));
    }

    @Test
    void testCalculateGrossPrice_InvalidInputs() {
        assertThrows(IllegalArgumentException.class, () ->
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("-10"), new BigDecimal("0.10")));

        assertThrows(IllegalArgumentException.class, () ->
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("10"), new BigDecimal("-0.10")));

        assertThrows(IllegalArgumentException.class, () ->
                GrossPriceCalculator.calculateGrossPrice(null, new BigDecimal("0.10")));

        assertThrows(IllegalArgumentException.class, () ->
                GrossPriceCalculator.calculateGrossPrice(new BigDecimal("10.00"), null));
    }
}
