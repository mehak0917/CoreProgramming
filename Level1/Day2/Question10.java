package Level1PracticePrograms;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input height in cm
        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        // Convert cm to inches
        double totalInches = cm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.println("Your height in cm is " + cm +
                ", in feet is " + feet +
                " and inches is " + String.format("%.2f", inches));

    }
}
