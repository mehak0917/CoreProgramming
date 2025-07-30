package JavaArrays.Level2;

import java.util.Scanner;

public class BMICalculator2DArray7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Step 2: Create multi-dimensional array and status array
        double[][] personData = new double[number][3]; // 0: Height, 1: Weight, 2: BMI
        String[] weightStatus = new String[number];

        // Step 3: Input height and weight with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Height input
            do {
                System.out.print("Enter height in meters: ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (personData[i][0] <= 0);

            // Weight input
            do {
                System.out.print("Enter weight in kg: ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (personData[i][1] <= 0);
        }

        // Step 4: Calculate BMI and determine status
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);

            personData[i][2] = bmi; // Store BMI

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 5: Display the results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.printf("Height: %.2f m\n", personData[i][0]);
            System.out.printf("Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
    }
}
