package assignments.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] ints = smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        System.out.println(Arrays.toString(ints));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {

        int smallest = nums[0];

        int[] res = new int[nums.length];

        for (int num : nums) {
            if (smallest > num) {
                smallest = num;
            }
        }
        System.out.println(smallest);
        return res;
    }

    public static int[] smallerNumbersThanCurrentTwo(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }
}
