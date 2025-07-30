package JavaArrays.Level1;

import java.util.*;

public class StoreAndSumArrayValues4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        int i = 0;

        while (i < 10) {
            double n = sc.nextDouble();
            if (n <= 0) break;
            arr[i++] = n;
        }

        System.out.println("Numbers entered:");
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
            sum += arr[j];
        }

        System.out.println("\nSum = " + sum);
    }
}

