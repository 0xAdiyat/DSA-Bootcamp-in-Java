package assignments.arrays;

import java.util.Arrays;

public class OneDArraySum {
    public static void main(String[] args) {
        int[] one_DSum = runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(one_DSum));

    }

    public static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static int[] runningSumEnhanced(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }


    public static int[] runningSumMethod2(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];

        }
        return nums;

    }
}
