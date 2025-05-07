
//Made By Bhumi Bhatt
package src;
import java.util.Scanner;

/**
 DigitCounter class counts the digit in a number including 0 and negative integers.
 */
public class DigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid! --- Please enter a valid integer.");
            return;
        }

        int number = scanner.nextInt();
        int digitCount = countDigits(number);

        System.out.println("Number of digits: " + digitCount);
        scanner.close();
    }

    //CountDigit method definition
    public static int countDigits(int number) {
        number = Math.abs(number); // Ignore negative sign

        //Edge Case for 0
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
