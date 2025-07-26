package controlflowstatements.Level1;
import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double input;

        System.out.println("Enter numbers (0 to stop):");
        input = sc.nextDouble();

        while (input != 0) {
            total += input;
            input = sc.nextDouble();
        }

        System.out.println("Total sum is: " + total);
    }
}
