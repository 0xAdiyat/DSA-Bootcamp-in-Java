package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial value: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter the depreciation rate: ");
        double depreciationRate = scanner.nextDouble();

        double depreciatedValue = calculateDepreciation(initialValue, depreciationRate);
        System.out.println("Depreciated value: " + depreciatedValue);

        scanner.close();
    }

    private static double calculateDepreciation(double initialValue, double depreciationRate) {
        double depreciatedValue = initialValue - (initialValue * (depreciationRate / 100));

        return depreciatedValue;

    }
}
