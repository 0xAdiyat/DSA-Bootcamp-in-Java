package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int principleAmount = scanner.nextInt();

        System.out.print("Enter the interest rate (in percentage): ");
        int interestRate = scanner.nextInt();

        System.out.print("Enter the time period (in years): ");
        int timePeriod = scanner.nextInt();

        double compoundInterest = calculateCompoundInterest(principleAmount, interestRate, timePeriod);
        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }

    public static double calculateCompoundInterest(double principal, double rate, int time) {
        double interestRate = rate / 100;
        double amount = principal * Math.pow(1 + interestRate, time);
//        amount = principal * (1 + interestRate) ^ time;
        double compoundInterest = amount - principal;
        return compoundInterest;
    }
}
