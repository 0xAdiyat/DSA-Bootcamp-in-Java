package assignments.the_first;

public class ReverseNumberPalindrome {
    public static void main(String[] args) {

        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }

    static boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) return false;


        int previous = x, ans = 0;

        while (x > 0) {
            int reminder = x % 10;
            x = x / 10;

            ans = ans * 10 + reminder;
        }
        return ans == previous;
    }

    static boolean isPalindromeConvertString(int num) {

        if (num < 0) {
            return false;
        }

        String str = String.valueOf(num);
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


