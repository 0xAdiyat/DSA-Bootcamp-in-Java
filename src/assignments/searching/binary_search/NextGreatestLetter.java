package assignments.searching.binary_search;

public class NextGreatestLetter {
    public static void main(String[] args) {
        // Given a sorted array of letters and a target letter
        System.out.println(nextGreatestLetter(new char[]{'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'}, 'e'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        // Initialize the search range
        int start = 0;                    // Starting index of the array
        int end = letters.length - 1;     // Ending index of the array

        // Perform binary search to find the next greatest letter
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Calculate the middle index

            // Check if the target letter is less than the middle letter
            if (target < letters[mid]) {
                end = mid - 1;  // Adjust the search range to the left half
            } else {
                start = mid + 1;  // Adjust the search range to the right half
            }
        }

        // After the binary search, 'start' points to the index where 'target' could be inserted,
        // and it represents the next letter greater than 'target'
        // However, since we need to consider the circular nature of the array,
        // we use modulo to wrap around if 'start' goes beyond the array length
        return letters[start % letters.length];
    }
}
