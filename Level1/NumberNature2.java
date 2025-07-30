package JavaArrays.Level1;
import java.util.Scanner;

public class NumberNature2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative");
            } else {
                System.out.println("Number " + num + " is Zero");
            }
        }

        // Comparing first and last element
        System.out.println("\nComparison of first and last element:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last numbers are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }

}
