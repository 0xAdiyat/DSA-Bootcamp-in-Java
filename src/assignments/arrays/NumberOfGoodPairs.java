package assignments.arrays;

//https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int gdPair = numIdenticalPairs3(new int[]{1, 2, 3, 1, 1, 3});
        System.out.println(gdPair);
    }

    private static int numIdenticalPairs(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length;
        int count = 0;
        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }


    private static int numIdenticalPairs2(int[] nums) {
        int start = 0;
        int end = nums.length;
        int count = 0;
        int temp = start;
        while (temp < end) {
            int j = start;
            while (j < end) {
                if (nums[temp] == nums[j] && temp < j) count++;
                j++;
            }
            temp++;
        }
        return count;
    }

    private static int numIdenticalPairs3(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a : A) {
            res += count[a]++;
        }
        return res;
    }
}
