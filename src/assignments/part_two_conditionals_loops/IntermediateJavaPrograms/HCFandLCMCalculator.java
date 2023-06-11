package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class HCFandLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate HCF
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF: " + hcf);

        // Calculate LCM
        System.out.println("\nLCM Of Two Numbers:");
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM: " + lcm);

        scanner.close();
    }

    private static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;

    }

    public static int calculateLCM(int num1, int num2) {
        int hcf = calculateHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
}
