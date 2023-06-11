package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.println("Enter numbers (enter 0 to terminate):");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                negativeSum += number;
            } else if (number % 2 == 0) {
                positiveEvenSum += number;
            } else {
                positiveOddSum += number;
            }

        }

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);

        scanner.close();

    }
}
