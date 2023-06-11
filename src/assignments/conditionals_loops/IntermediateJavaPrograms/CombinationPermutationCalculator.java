package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class CombinationPermutationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        int nCr = calculateNcr(n, r);
        int nPr = calculateNpr(n, r);

        System.out.println("NCR: " + nCr);
        System.out.println("NPR: " + nPr);

        scanner.close();
    }

    public static int calculateNcr(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        int nCr = numerator / denominator;
        return nCr;
    }

    public static int calculateNpr(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(n - r);
        int nPr = numerator / denominator;
        return nPr;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

