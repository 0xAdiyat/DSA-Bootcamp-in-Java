package assignments.searching.binary_search;

public class AscSearch {
    public static void main(String[] args) {

        // It's a sorted array
        System.out.println(performAscSearch(36, new int[]{-18, -12, 2, 4, 6, 10, 36, 68}));
    }

    // return the index
    // return -1 if it doesn't exit
    static int performAscSearch(int target, int[] numbers) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            // find the middle element
            int middle = start + (end - start) / 2; // might be possible that (start + end) exceeds the range of int in java

            if (target < numbers[middle]) {
                end = middle - 1;
            } else if (target > numbers[middle]) {
                start = middle + 1;
            } else if (target == numbers[middle]) {
                return middle;
            }
        }


//        return Arrays.binarySearch(numbers, 36);
        return -1;
    }
}
