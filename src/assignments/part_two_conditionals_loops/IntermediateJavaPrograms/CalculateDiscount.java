package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * (discountPercentage / 100));

        System.out.println("Discounted price: " + discountedPrice);
    }
}

