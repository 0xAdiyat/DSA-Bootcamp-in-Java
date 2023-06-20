package assignments.arrays;

import java.util.Arrays;


//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        if (nums.length % 2 == 0) {
            for (int index = 0; index < n; index++) {

                shuffledArray[index * 2] = nums[index];
                shuffledArray[((index * 2) + 1)] = nums[index + n];
            }
        }

        return shuffledArray;

    }
}
