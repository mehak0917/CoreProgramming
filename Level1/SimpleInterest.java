package com.assistedprograms;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the Time(int yrs): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: "+ simpleInterest);
    }
}
