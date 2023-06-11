package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = checkLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    public static boolean checkLeapYear(int year) {
        // Leap years are divisible by 4, but not divisible by 100 unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
