package com.assistedprograms;
import java.util.Scanner;
public class AverageofThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Print average
        System.out.println("Average is: " + average);
    }
}
