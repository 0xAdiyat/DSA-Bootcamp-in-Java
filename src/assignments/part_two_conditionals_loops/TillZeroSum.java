package assignments.part_two_conditionals_loops;

import java.util.Scanner;

public class TillZeroSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 to stop):");
        int sum = 0;
        int number;

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;

        }
        System.out.println("Sum of the numbers: " + sum);

    }
}
