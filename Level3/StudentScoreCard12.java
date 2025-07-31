package JavaMethods.Level3;

import java.util.Scanner;

public class StudentScoreCard12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks);
        printScorecard(marks, results);

        sc.close();
    }

    // Step b: Generate random 2-digit PCM marks
    public static int[][] generateMarks(int n) {
        int[][] scores = new int[n][3]; // 3 subjects: P, C, M

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 41 + 60); // Physics: 60–100
            scores[i][1] = (int) (Math.random() * 41 + 60); // Chemistry
            scores[i][2] = (int) (Math.random() * 41 + 60); // Math
        }

        return scores;
    }

    // Step c: Calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3]; // [][0]=Total, [][1]=Average, [][2]=Percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = Math.round(total);
            result[i][1] = Math.round(avg * 100.0) / 100.0;        // round to 2 decimal places
            result[i][2] = Math.round(percent * 100.0) / 100.0;    // round to 2 decimal places
        }

        return result;
    }

    // Step d: Print scorecard with grades
    public static void printScorecard(int[][] marks, double[][] results) {
        System.out.println("\nS.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\t%\tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            double percentage = results[i][2];
            String grade = getGrade(percentage);

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            (int) results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            grade
            );
        }
    }

    // Grade assignment method
    public static String getGrade(double percent) {
        if (percent >= 80)
            return "A";
        else if (percent >= 70)
            return "B";
        else if (percent >= 60)
            return "C";
        else if (percent >= 50)
            return "D";
        else if (percent >= 40)
            return "E";
        else
            return "R";
    }
}
