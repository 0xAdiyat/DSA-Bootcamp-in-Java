package assignments.searching.binary_search;

//ceiling = smallest element in array greater or equal to target
public class CeilingOfANumber {
    public static void main(String[] args) {
        System.out.println("Result index: " + bs(12, new int[]{-18, -12, 2, 4, 6, 10, 36, 68}));


    }

    static int bs(int target, int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target == arr[mid]) return mid;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        // if target is not found then it will select the next greater element
        // which is the value of [end +1]
        System.out.println("Next greater element: " + arr[end + 1]);
        return end + 1;
    }
}
