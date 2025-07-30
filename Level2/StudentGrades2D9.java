package JavaArrays.Level2;

import java.util.Scanner;

public class StudentGrades2D9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3]; // [students][subjects: 0=Phy, 1=Chem, 2=Math]
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("Invalid! Enter positive marks.");
                    j--; // re-enter for same subject
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = sum / 3.0;

            if (percentages[i] >= 80)
                grades[i] = 'A';
            else if (percentages[i] >= 70)
                grades[i] = 'B';
            else if (percentages[i] >= 60)
                grades[i] = 'C';
            else if (percentages[i] >= 50)
                grades[i] = 'D';
            else if (percentages[i] >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }

        // Display results
        System.out.println("\nResult:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                    ": Physics = " + marks[i][0] +
                    ", Chemistry = " + marks[i][1] +
                    ", Maths = " + marks[i][2] +
                    ", Percentage = " + percentages[i] +
                    ", Grade = " + grades[i]);
        }

        sc.close();
    }
}
