package assignments.conditionals_loops;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/largest-number/
public class TheLargestNumber {
    public static void main(String[] args) {

        largestNumber(new int[]{3, 30, 34, 5, 9});
    }

    public static String largestNumber(int[] nums) {

        String string = Arrays.toString(nums);
        String[] stringArray = string.substring(1, string.length() - 1).split(", ");

        StringBuilder resultBuilder = new StringBuilder();

        for (String element : stringArray) {
            resultBuilder.append(element);
        }

        String[] digitArray = new String[resultBuilder.length()];

        for (int i = 0; i < resultBuilder.toString().length(); i++) {
            digitArray[i] = String.valueOf(resultBuilder.charAt(i));

        }


        int size = stringArray.length;
        ArrayList<String> strings = new ArrayList<>(digitArray.length);

        ArrayList<Integer> arr = new ArrayList<>(digitArray.length);

        for (int i = 0; i < digitArray.length; i++) {
            String s = digitArray[digitArray.length - i - 1];
            strings.add(s);
            int integer = Integer.parseInt(s);
            int integer1 = Integer.parseInt(strings.get(i));
            if (integer > integer1) {
                arr.add(integer);
                System.out.println("yoy");
            } else {
                arr.add(Integer.valueOf(strings.get(i)));
                System.out.println("nai");
            }

        }


        System.out.println(arr);
        return "";
    }
}
