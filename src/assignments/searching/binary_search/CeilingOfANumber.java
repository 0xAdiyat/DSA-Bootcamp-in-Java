package assignments.searching.binary_search;

// Ceiling of a Number: Smallest element in the array greater than or equal to the target
public class CeilingOfANumber {
    public static void main(String[] args) {
        System.out.println("Result index: " + findCeiling(12, new int[]{-18, -12, 2, 4, 6, 10, 36, 68}));
    }

    // Function to perform binary search and find the ceiling of the target
    static int findCeiling(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                // Target found, return the index
                return mid;
            }

            if (target < arr[mid]) {
                // Target is smaller, search in the left half
                end = mid - 1;
            } else if (target > arr[mid]) {
                // Target is larger, search in the right half
                start = mid + 1;
            }
        }

        // If target is not found, 'start' points to the next greater element
        // which is the value of 'arr[start]'
        System.out.println("Next greater element: " + arr[start]);

        // As it's a sorted array, 'start' will always be greater than 'mid'
        // because 'start' was updated as 'mid + 1' during the search.
        return start;

        /*
         * If the objective was to find the floor of a number:
         * [Floor of a number] means: Greatest number smaller than or equal to the target.
         * In that case, the return statement would be 'end', as 'end' is one index lower
         * than 'mid' when 'target > arr[mid]', making it the greatest number smaller than the target.
         */
    }
}
