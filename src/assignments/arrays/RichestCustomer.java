package assignments.arrays;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}

        }));
    }

    public static int maximumWealth(int[][] accounts) {

        int richest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int[] account = accounts[i];
            int sum = 0;
            for (int j = 0; j < account.length; j++) {
                int wealth = account[j];

                sum += wealth;
            }
            if (richest < sum) {
                richest = sum;
            }

        }

        return richest;
    }

}
