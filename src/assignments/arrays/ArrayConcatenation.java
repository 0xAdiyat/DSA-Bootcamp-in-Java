package assignments.arrays;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] concatenation = getConcatenationMethod2(new int[]{1, 2, 1});
        System.out.println(Arrays.toString(concatenation));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = 0;
        for (int n : nums) {
            ans[i++] = n;
        }
        for (int n2 : nums) {
            ans[i++] = n2;
        }
        return ans;
    }

    public static int[] getConcatenationMethod2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
