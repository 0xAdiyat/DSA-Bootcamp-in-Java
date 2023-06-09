package assignments.part_one_first_java;

public class PalindromeString {
    public static void main(String[] args) {


        boolean palindrome = isPalindromeUsing2Pointers("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }

    static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = original.length();
        String[] str = original.split("");

        String newStr = "";
        for (int i = 0; i < length; i++) {


            newStr += str[length - i - 1];
        }


        return newStr.equals(original);
    }

    static boolean isPalindromeUsing2Pointers(String s) {
        if (s.isEmpty()) {
            return true;
        }
        String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = original.length();
        String[] str = original.split("");

        String newStr = "";
        for (int i = 0; i < length; i++) {
            String start = str[i].toLowerCase();
            String end = str[length - i - 1].toLowerCase();

            newStr += end;
        }


        return newStr.equals(original);
    }

    static boolean isPalindromeStrBuilder(String s) {

        String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = original.length();
        char[] str = original.toCharArray();


        StringBuilder newStr = new StringBuilder();
        newStr.append(str);
        newStr.reverse();
        newStr.trimToSize();


        return newStr.toString().equals(original);
    }
}
