package assignments.part_one_first_java;

public class ValidPalindrome {
    public static void main(String[] args) {

        boolean b = isPalindrome("cbbcc");
        System.out.println(b);

    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return isPalindromeValid(s, i + 1, j) || isPalindromeValid(s, i, j - 1);
        }
        return true;
    }

    public static boolean isPalindromeValid(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }

}
