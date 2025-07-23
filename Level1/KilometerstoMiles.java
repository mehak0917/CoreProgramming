package com.assistedprograms;
import java.util.Scanner;
public class KilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Print result
        System.out.println("Distance in miles: " + miles);
    }
}
