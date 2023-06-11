package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        double[] grades = new double[numOfSubjects];
        for (int i = 0; i < numOfSubjects; i++) {
            grades[i] = scanner.nextDouble();
        }

        double cgpa = calculateCGPA(grades);

        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }

    private static double calculateCGPA(double[] grades) {

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double cgpa = sum / grades.length;

        return cgpa;
    }
}
