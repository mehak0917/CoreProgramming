package com.assistedprograms;
import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Converting to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Displaying result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

}
