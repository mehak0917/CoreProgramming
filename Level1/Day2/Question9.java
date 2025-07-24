package Level1PracticePrograms;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking fee input
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Taking discount percentage input
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculating discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

}
