package assignments.conditionals_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class TillZeroLargest {
    public static void main(String[] args) {
        Method1();

    }

    private static void Method1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 to stop):");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers.add(number);

        }
        int largest = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int getNum = numbers.get(i);
            if (getNum > largest) {
                largest = getNum;
            }
        }
        System.out.println("Largest number: " + largest);
    }

    private static void Method2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 to stop):");
        int largestNumber = Integer.MIN_VALUE;
        int number;

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }


        }
        if (largestNumber != Integer.MIN_VALUE) {

        }

    }
}
