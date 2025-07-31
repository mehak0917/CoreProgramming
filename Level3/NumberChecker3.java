package JavaMethods.Level3;

import java.util.Arrays;

public class NumberChecker3 {

    // Method to count number of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to calculate sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to get digit frequency in a 2D array
    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;         // Digit
            result[i][1] = freq[i];   // Frequency
        }
        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 21; // You can change the input number here
        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Get digits
        int[] digits = getDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        // Sum of squares
        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        // Harshad number check
        System.out.println("Is Harshad Number? " + (isHarshad(number, digits) ? "Yes" : "No"));

        // Frequency
        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int[] row : freq) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + " => " + row[1] + " time(s)");
            }
        }
    }
}
