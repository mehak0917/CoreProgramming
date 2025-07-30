package JavaMethods.Level2;

import java.util.Scanner;

public class QuadraticRoot {
    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) + 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            return new double[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        double[] roots = findQuadraticRoots(a, b, c);
        if (roots.length == 2) {
            System.out.printf("The equation has two real roots: x = %.2f and x = %.2f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one real root: x = %.2f\n", roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
