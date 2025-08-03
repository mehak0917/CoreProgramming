package BuiltInFunction.two;

import java.util.Scanner;

public class TempConvert8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. F to C\n2. C to F");
        int choice = sc.nextInt();
        double temp = sc.nextDouble();
        if (choice == 1)
            System.out.println("Celsius: " + fToC(temp));
        else
            System.out.println("Fahrenheit: " + cToF(temp));
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
}
