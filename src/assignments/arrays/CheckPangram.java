package assignments.arrays;

import java.util.HashSet;

public class CheckPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    private static boolean checkIfPangram(String sentence) {
        HashSet<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            s.add(sentence.charAt(i));
        }

        return s.size() == 26;
    }

}