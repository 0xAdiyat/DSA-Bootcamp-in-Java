package assignments.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] ints = smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        System.out.println(Arrays.toString(ints));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        int start = 0;
        int end = nums.length;

        for (int i = start; i < end; i++) {
            int totalCount = 0;

            for (int j = start; j < end; j++) {
                if (nums[i] > nums[j]) {
                    totalCount = totalCount + 1;

                }
            }
            res[i] = totalCount;

        }

        return res;
    }

}
