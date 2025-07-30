package JavaArrays.Level1;

import java.util.Scanner;

public class MultiplicationTable5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Array to store results (4 values: for 6, 7, 8, and 9)
        int[] multiplicationResult = new int[4];

        // Calculate and store results in array
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);  // i + 6 gives 6 to 9
        }

        // Display the results
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        scanner.close();

    }
}
