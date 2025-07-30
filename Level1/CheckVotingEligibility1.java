package JavaArrays.Level1;

import java.util.Scanner;

public class CheckVotingEligibility1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (age[i] < 0) {
                System.out.println("Age is invalid");
            } else if (age[i] >= 18) {
                System.out.println("Student with age " + age[i] + " can vote.");
            } else {
                System.out.println("Student with age " + age[i] + " cannot vote.");
            }
        }

    }
}
