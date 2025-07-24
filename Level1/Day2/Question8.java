package Level1PracticePrograms;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        double km; // variable to store user input in kilometers

        Scanner input = new Scanner(System.in); // create Scanner object

        // Take input from user
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextInt();

        // Conversion formula
        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

}
