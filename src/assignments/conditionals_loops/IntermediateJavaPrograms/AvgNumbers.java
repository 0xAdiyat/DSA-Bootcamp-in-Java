package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class AvgNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;
        int sum = 0;
        while (n <= 5) {
            System.out.print("Enter value for " + n + ": ");
            int i = sc.nextInt();
            sum += i;

            n++;
        }

        sum = sum / 2;

        System.out.println("Average: " + sum);
    }
}
