package assignments.functions;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSumOfNaturalNumbers(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);

    }

    private static int calculateSumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}
