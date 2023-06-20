package assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {

        List<Boolean> booleans = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(Arrays.toString(booleans.toArray()));

    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>(candies.length);

        int preGreatest = 0;
        boolean itsTrue = false;
        for (int candy : candies) {

            if (candy > preGreatest) {
                preGreatest = candy;
            }


        }

        for (int i = 0; i < candies.length; i++) {
            int candie = candies[i] += extraCandies;
            if (candie >= preGreatest) {
                itsTrue = true;
                result.add(itsTrue);

            } else {
                itsTrue = false;
                result.add(itsTrue);
            }
        }

        return result;
    }

    private static List<Boolean> kidsWithCandiesOptimized(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);

        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }


}
