package assignments.searching.binary_search;

public class NextGreatestLetter {
    public static void main(String[] args) {

        System.out.println(nextGreatestLetter(new char[]{'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'}, 'e'));
    }

    static char nextGreatestLetter(char[] letters, char target) {


        if (letters.length == 0) return (char) -1;

        int end = letters.length - 1;
        if (target >= letters[end]) return letters[0];
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == letters[mid]) return (mid + 1 < letters.length) ? letters[mid + 1] : letters[0];
            if (target > letters[mid]) start = mid + 1;
            else if (target < letters[mid]) end = mid - 1;
        }

        return letters[start];
    }
}
