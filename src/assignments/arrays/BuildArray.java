package assignments.arrays;

import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[] ints = buildArray(new int[]{0, 2, 1, 5, 3, 4});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            result[i] = nums[num];
            i++;
        }

        return result;
    }

}
