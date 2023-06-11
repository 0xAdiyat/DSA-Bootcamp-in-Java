package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println("Result: " + result);

        scanner.close();
    }

    private static int calculatePower(int base, int exponent) {

        int result = 1;
        for (int i = 0; i < exponent; i++) {

            result *= base;
        }
        return result;
    }
}
