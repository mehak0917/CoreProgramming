package JavaArrays.Level2;

import java.util.Scanner;

public class DigitFrequency10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[10]; // To store frequency of digits 0–9

        while (num > 0) {
            int digit = num % 10;
            digits[digit]++;
            num /= 10;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0)
                System.out.println("Digit " + i + " appears " + digits[i] + " times");
        }

        sc.close();
    }
}

