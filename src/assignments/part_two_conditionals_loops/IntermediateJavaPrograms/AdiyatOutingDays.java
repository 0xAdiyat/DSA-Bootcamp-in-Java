package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.time.LocalDate;
import java.time.Month;

public class AdiyatOutingDays {
    public static void main(String[] args) {
        // Set the month and year
        Month month = Month.AUGUST;
        int year = 2023;

        // Get the total number of days in the month
        int totalDays = month.length(LocalDate.of(year, month, 1).isLeapYear());


        // Count the number of even days
        int outingDays = 0;
        for (int day = 1; day <= totalDays; day++) {
            if (day % 2 == 0) {
                outingDays++;
            }
        }

        System.out.println("Number of days Kunal can go out in " + month.toString() + ": " + outingDays);
    }
}
