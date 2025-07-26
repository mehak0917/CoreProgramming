package controlflowstatements.Level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height to meters
        double heightM = heightCm / 100;

        // Step 3: Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Step 4: Print BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Step 5: Determine weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
