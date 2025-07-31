package JavaMethods.Level3;

public class NumberChecker5 {

    // Method to check if number is Prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if number is Neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if number is Spy (sum of digits == product of digits)
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if number is Automorphic (square ends with number itself)
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if number is Buzz (divisible by 7 or ends with 7)
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to test all methods
    public static void main(String[] args) {
        int number = 7; // You can test with any number

        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz? " + (isBuzz(number) ? "Yes" : "No"));
    }
}
