package assignments.functions;

public class DigitCounter {


    static int countDigitMathematicalApproach(int num) {

        int checkedNumber = checkNum(num);

        return (int) (Math.log10(checkedNumber) + 1);
    }

    static int generalApproach(int num) {

        int checkedNumber = checkNum(num);

        int count = 0;
        while (checkedNumber > 0) {
            count++;
            checkedNumber /= 10;
        }
        return count;
    }

    public static void main(String[] args) {

        System.err.println(countDigitMathematicalApproach(232342));
        System.out.println(generalApproach(232342));
    }

    static int checkNum(int unverifiedNumber) {
        if (unverifiedNumber < 0)
            return unverifiedNumber * -1;
        if (unverifiedNumber == 0) return 1;
        return unverifiedNumber;
    }
}
