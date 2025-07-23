package assistedprograms;
import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);  // Scanner object for input

                // Ask the user to enter the radius
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();

                // Calculate area using the formula
                double area = Math.PI * radius * radius;

                // Print the area
                System.out.println("The area of the circle is: " + area);
            }
        }
