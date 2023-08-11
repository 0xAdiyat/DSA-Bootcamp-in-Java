package assignments.searching.binary_search;

public class AscSearch {
    public static void main(String[] args) {

        // Binary Search will only be performed if the array is sorted
        System.out.println(performAscSearch(36, new int[]{-18, -12, 2, 4, 6, 10, 36, 68}));

        System.out.println(orderAgnosticBS(45, new int[]{7434, 384, 45, 3}));

        System.out.println(orderAgnosticBS(4, new int[]{-18, -12, 2, 4, 6, 10, 36, 68}));
    }

    // return the index
    // return -1 if it doesn't exit
    static int performAscSearch(int target, int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;


        while (start <= end) {
            // find the middle element
            int middle = start + (end - start) / 2; // might be possible that (start + end) exceeds the range of int in java
            if (target == numbers[middle]) {
                return middle; // Answer found
            }

            if (target < numbers[middle]) {
                end = middle - 1;
            } else if (target > numbers[middle]) {
                start = middle + 1;
            }

        }
//        return Arrays.binarySearch(numbers, 36);
        return -1;
    }

    static int orderAgnosticBS(int target, int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        boolean orderCheck = isAsc(numbers);


        while (start <= end) {
            // find the middle element
            int middle = start + (end - start) / 2; // might be possible that (start + end) exceeds the range of int in java
            if (target == numbers[middle]) {
                return middle;
            }

            // order agnostic binary search
            if (orderCheck) {
                if (target < numbers[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > numbers[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }

        return -1;
    }

    static boolean isAsc(int[] arr) {
        return arr[0] < arr[arr.length - 1];
    }
}
