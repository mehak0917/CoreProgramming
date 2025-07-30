package JavaArrays.Level1;

import java.util.Scanner;
public class MeanHeightOfFootballTeam6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        // Take input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display mean height
        System.out.println("Mean height of the football team is: " + mean);

        scanner.close();
    }
}
