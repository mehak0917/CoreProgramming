package JavaMethods.Level3;

import java.util.Arrays;

public class NumberChecker4 {

    // Method to count number of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // skip leading digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int number = 121; // You can change this number to test others

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        System.out.println("Arrays Equal? " + (areArraysEqual(digits, reversed) ? "Yes" : "No"));
        System.out.println("Is Palindrome? " + (isPalindrome(digits) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
    }
}
