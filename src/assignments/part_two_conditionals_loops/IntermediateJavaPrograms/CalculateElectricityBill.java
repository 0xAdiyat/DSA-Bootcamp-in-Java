package assignments.part_two_conditionals_loops.IntermediateJavaPrograms;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        float perUnit = 1.5F;
        int unitConsumed = 200;

        System.out.println("Electricity bill: $" + (perUnit * unitConsumed));
    }
}
