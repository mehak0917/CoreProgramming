package JavaMethods.Level3;
import java.util.Scanner;

public class EuclideanDistanceAndLineEquation9 {

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate slope and y-intercept
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // [0] = slope (m), [1] = y-intercept (b)

        if (x1 == x2) {
            // Vertical line case: slope is undefined
            System.out.println("The line is vertical. Equation is x = " + x1);
            return null;
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        result[0] = m;
        result[1] = b;

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        // Line equation
        double[] line = calculateLineEquation(x1, y1, x2, y2);
        if (line != null) {
            double m = line[0];
            double b = line[1];
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", m, b);
        }
    }
}
