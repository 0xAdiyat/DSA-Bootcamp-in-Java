package assignments.searching.binary_search;

import java.util.ArrayList;

//https://leetcode.com/problems/sqrtx/
public class SqrtX {
    public static void main(String[] args) {

        System.out.println(mySqrt2(36));
    }

    static int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                System.out.println("Mid+ 1 : " + mid + 1);
                System.out.println("Exception: " + x / (mid + 1));
                if (mid + 1 > x / (mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }

    static int mySqrt2(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    static int mySqrtWrongOne(int x) {

        if (x == 0)
            return 0;

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            double y = (double) x;

            y = y / 2;

            boolean hasFractionalPart = y != (int) y;

            if (hasFractionalPart) {
                x = x + 1;
            } else {
                x = (int) y;
            }
            nums.add(x);
        }

        int start = 0;
        int end = nums.size();

        for (int i = start; i < nums.size(); i++) {
            int mid = start + (end - start) / 2;
            if (nums.get(mid) > nums.get(end - 1))
                start = mid + 1;
            else {
                if (nums.get(mid) < 2)
                    return 2;

                return nums.get(mid);
            }


        }

        return 0;
    }
}

