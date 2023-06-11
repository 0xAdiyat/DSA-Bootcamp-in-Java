package assignments.conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.nextLine().charAt(0);

        if (isVowel(character)) {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is a consonant.");
        }

        scanner.close();
    }

    private static boolean isVowel(char character) {
        character = Character.toLowerCase(character);

        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
