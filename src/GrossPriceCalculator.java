package src;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility class to calculate gross price (before tax) from net price (including tax).
 */
public class GrossPriceCalculator {

    /**
     * Calculates the gross price (before tax) from the net price (after tax) and tax rate.
     *
     * @param netPrice the total price including taxes
     * @param taxRate the tax rate as a decimal (e.g., 0.12 for 12%)
     * @return the gross price before tax
     * @throws IllegalArgumentException if netPrice is negative or taxRate is negative
     */
    public static BigDecimal calculateGrossPrice(BigDecimal netPrice, BigDecimal taxRate) {
        if (netPrice == null || taxRate == null) {
            throw new IllegalArgumentException("Inputs cannot be null.");
        }
        if (netPrice.compareTo(BigDecimal.ZERO) < 0 || taxRate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Net price and tax rate must be non-negative.");
        }

        BigDecimal divisor = BigDecimal.ONE.add(taxRate);
        return netPrice.divide(divisor, 2, RoundingMode.HALF_UP);
    }
}
