package controlflowstatements.Level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Step 2: Loop through each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // Get last digit
            sum += digit * digit * digit;     // Add cube of digit to sum
            originalNumber /= 10;             // Remove last digit
        }

        // Step 3: Check if Armstrong
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
