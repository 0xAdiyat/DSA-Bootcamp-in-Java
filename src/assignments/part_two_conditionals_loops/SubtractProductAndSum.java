package assignments.part_two_conditionals_loops;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/967747353/
public class SubtractProductAndSum {
    public static void main(String[] args) {

        int n = 234;
        int myReminderSum = 0;
        int myReminderMultiply = 1;
        while (n > 0) {
            int reminder = n % 10;
            n /= 10;
            myReminderSum = myReminderSum + reminder;
            myReminderMultiply = myReminderMultiply * reminder;

        }
        System.out.println(myReminderSum + " " + myReminderMultiply);

        int result = myReminderMultiply - myReminderSum;

    }
}
