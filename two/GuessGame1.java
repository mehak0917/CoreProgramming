package BuiltInFunction.two;

import java.util.Scanner;

public class GuessGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String response;

        do {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            response = sc.next();

            if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            }
        } while (!response.equals("correct"));
        System.out.println("Guessed correctly!");
    }
}
