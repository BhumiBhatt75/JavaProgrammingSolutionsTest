package src;

import java.util.Scanner;

/**
 Largest Number comparing two numbers
 */
public class LargerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        
        System.out.println("The larger number is: " + findLarger(number1, number2));

        scanner.close();
    }

    
    public static int findLarger(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
