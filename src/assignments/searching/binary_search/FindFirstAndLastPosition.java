package assignments.searching.binary_search;

import java.util.Arrays;

// LeetCode problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Runtime complexity: O(log n) due to binary search
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        // Given a sorted array and a target value
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    static int[] searchRange(int[] nums, int target) {
        // Initialize result array with default values
        int[] ans = {-1, -1};

        // Find the start and end indices of the target value using binary search
        int start = search(nums, target, true);  // Find start index
        int end = search(nums, target, false);   // Find end index

        // Update the result array with start and end indices
        ans[0] = start;
        ans[1] = end;

        return ans;  // Return the result array with start and end indices
    }

    // This function performs binary search to find the index of the target value
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;  // Initialize the result index to -1
        int start = 0;  // Initialize the start of the search range
        int end = nums.length - 1;  // Initialize the end of the search range

        while (start <= end) {
            // Find the middle element using (start + end) / 2 formula
            int middle = start + (end - start) / 2;

            if (target == nums[middle]) {
                ans = middle;  // Update the result index to the current middle index
                // Adjust the search range based on whether to find the start index or end index
                if (findStartIndex) {
                    end = middle - 1;  // Adjust [end] to continue searching in the left half
                } else {
                    start = middle + 1;  // Adjust start to continue searching in the right half
                }
            }

            if (target < nums[middle]) {
                end = middle - 1;  // Adjust [end] to search in the left half
            } else {
                start = middle + 1;  // Adjust [start] to search in the right half
            }
        }

        return ans;  // Return the found index (either start or end index)
    }
}
