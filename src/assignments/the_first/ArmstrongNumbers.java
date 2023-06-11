package assignments.the_first;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        int lowerBound = 100, upperBound = 500;

        for (int number = lowerBound; number <= upperBound; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }


        }

    }

    static boolean isArmstrong(int num) {

        int originalNumber = num;
        int sum = 0;

        while (num > 0) {

            int reminder = num % 10;
            num /= 10;
            int cubicReminder = reminder * reminder * reminder;
            sum += cubicReminder;

        }


        return sum == originalNumber;
    }


}
