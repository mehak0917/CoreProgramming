package JavaMethods.Level3;

import java.util.Scanner;

public class CollinearityCheck10 {

    // Method 1: Using slope comparison
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    // Method 2: Using area of triangle
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Using slope
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + collinearBySlope);

        // Using area
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Method: " + collinearByArea);

        // Final result
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are Collinear.");
        } else {
            System.out.println("The points are NOT Collinear.");
        }
    }
}

