package com.assistedprograms;
import java.util.Scanner;
public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * height;

        System.out.println("The volume of cylinder is: "+ volume);
    }
}
