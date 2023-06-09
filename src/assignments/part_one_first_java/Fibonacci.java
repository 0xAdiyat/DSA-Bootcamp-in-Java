package assignments.part_one_first_java;

public class Fibonacci {
    public static void main(String[] args) {

        fib(4);

    }
    static int fib(int n){

        if (n == 0 || n == 1) {
            return n;
        }



        if (n < 0){
            return Integer.MAX_VALUE;
        }

        int firstNumber = 0;
        int secondNumber = 1;
        int fibSum = 0;
//        System.out.print(firstNumber + " " );

        for (int i = 0; i < n; i++){

            int nextNumber = secondNumber + firstNumber;
//            System.out.print(nextNumber + " ");
            fibSum += secondNumber;
            secondNumber = firstNumber;

            firstNumber = nextNumber;

        }
//        System.out.println(sum);
        return fibSum;

    }
}
