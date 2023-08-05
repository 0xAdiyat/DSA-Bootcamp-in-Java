package assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class target_array {
    public static void main(String[] args) {
        int[] targetArray = createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0});
        System.out.println(Arrays.toString(targetArray));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] res = new int[len];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int zero = 0;
        for (int i = zero; i < len; i++) {
            arrayList.add(index[i], nums[i]);
        }
        for (int i = zero; i < len; i++) {
            res[i] = arrayList.get(i);
        }

        return res;
    }
}
