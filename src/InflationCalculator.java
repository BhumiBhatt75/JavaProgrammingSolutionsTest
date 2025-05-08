package src;

import java.util.Scanner;

public class InflationCalculator {

    public static double calculateCompoundedInflation(double rate, int years) {
        double multiplier = 1 + rate / 100;
        double compounded = Math.pow(multiplier, years);
        return (compounded - 1) * 100; // convert back to percentage
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual retail inflation rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double compoundedInflation = calculateCompoundedInflation(rate, years);

        System.out.printf("Compounded retail inflation after %d years is: %.2f%%%n", years, compoundedInflation);

        scanner.close();
    }
}
