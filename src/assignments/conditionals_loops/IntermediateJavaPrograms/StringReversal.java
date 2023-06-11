package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed.append(input.charAt(i));
//        }
        for (int i = 0; i < input.length(); i++) {
            reversed.append(input.charAt(input.length() - 1 - i));

        }
        return reversed.toString();
    }
}
