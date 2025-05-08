package src;

import java.util.Scanner;

public class TimeConverter {

    public static String convertSeconds(long totalSeconds) {
        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        return String.format("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)",
                days, hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        long inputSeconds = scanner.nextLong();

        String result = convertSeconds(inputSeconds);
        System.out.println(result);

        scanner.close();
    }
}
