package assignments.the_first;

public class CountNums {
    public static void main(String[] args) {
        int n = 2332, target = 3;
        int count = 0;
        while (n > 0) {
            int reminder = n % 10;
            if (reminder == target) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);

    }
}
