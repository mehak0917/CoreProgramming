package JavaArrays.Level2;

import java.util.Scanner;

public class StudentGrades8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            int total = 0;
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String sub = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Math";
                System.out.print("Enter marks in " + sub + ": ");
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Enter positive marks!");
                    j--; // repeat the same subject
                    continue;
                }
                marks[i][j] = m;
                total += m;
            }

            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d => Percentage: %.2f%%, Grade: %c\n", i + 1, percentage[i], grade[i]);
        }
    }
}
