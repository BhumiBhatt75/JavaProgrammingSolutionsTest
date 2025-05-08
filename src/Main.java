package src;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal netPrice = new BigDecimal("99.95");
        BigDecimal taxRate = new BigDecimal("0.12");

        BigDecimal grossPrice = GrossPriceCalculator.calculateGrossPrice(netPrice, taxRate);
        System.out.println("Gross Price: " + grossPrice);
    }
}
