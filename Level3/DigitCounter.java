package controlflowstatements.Level3;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        // Step 2: Handle zero explicitly
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Loop through digits
            while (number != 0) {
                number /= 10;   // Remove last digit
                count++;        // Increase count
            }
        }

        // Step 4: Output result
        System.out.println("Number of digits: " + count);
    }
}
