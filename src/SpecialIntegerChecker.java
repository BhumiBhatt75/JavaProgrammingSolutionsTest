package src;

import java.util.Scanner;

public class SpecialIntegerChecker {

    public static boolean isSpecialInteger(int num) {
        if (num < 10 || num > 99) {
            return false; // Not a two-digit number
        }

        int tens = num / 10;
        int units = num % 10;

        int result = tens + units + (tens * units);
        return result == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int input = scanner.nextInt();

        if (isSpecialInteger(input)) {
            System.out.println(input + " is a special two-digit integer.");
        } else {
            System.out.println(input + " is NOT a special two-digit integer.");
        }

        scanner.close();
    }
}
