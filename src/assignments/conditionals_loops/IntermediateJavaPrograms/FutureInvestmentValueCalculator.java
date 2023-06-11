package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class FutureInvestmentValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        int timePeriod = scanner.nextInt();

        double futureValue = calculateFutureInvestmentValue(principal, interestRate, timePeriod);
        System.out.printf("Future Investment Value: $%.2f", futureValue);

        scanner.close();
    }

    private static double calculateFutureInvestmentValue(double principal, double interestRate, int timePeriod) {
        double rate = interestRate / 100;
        return principal * Math.pow(1 + rate, timePeriod);
    }
}
