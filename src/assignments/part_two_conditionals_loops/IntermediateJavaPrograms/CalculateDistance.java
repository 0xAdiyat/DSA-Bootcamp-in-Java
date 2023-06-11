package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of Point 1 (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of Point 2 (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = distanceBetweenPoints(x1, y1, x2, y2);

        System.out.println("Distance between the two points: " + distance);
    }

    public static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double distanceSquared = deltaX * deltaX + deltaY * deltaY;
        double distance = Math.sqrt(distanceSquared);

        return distance;
    }
}
