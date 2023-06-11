package assignments.functions;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        int[] triplet1 = {3, 4, 5};
        int[] triplet2 = {5, 12, 13};
        int[] triplet3 = {6, 8, 12};

        System.out.println("Triplet 1: " + isPythagoreanTriplet(triplet1));
        System.out.println("Triplet 2: " + isPythagoreanTriplet(triplet2));
        System.out.println("Triplet 3: " + isPythagoreanTriplet(triplet3));
    }

    private static boolean isPythagoreanTriplet(int[] triplet) {

        int a = triplet[0];
        int b = triplet[1];
        int c = triplet[2];

        double bPow = Math.pow(b, 2);
        double cPow = Math.pow(c, 2);
        double aPow = Math.pow(a, 2);

        double largest = Math.max(aPow, Math.max(bPow, cPow));

        if (largest == cPow) {
            return aPow + bPow == cPow;

        } else if (largest == bPow) {
            return aPow + cPow == bPow;

        } else {
            return bPow + cPow == aPow;
        }

        /*
        if (largest == a) {
            return a * a == b * b + c * c;
        } else if (largest == b) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
        * */
    }
}
