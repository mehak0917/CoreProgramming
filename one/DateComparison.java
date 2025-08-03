package BuiltInFunction.one;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first date
        System.out.println("Enter first date (yyyy-mm-dd): ");
        String date1Str = sc.nextLine();
        LocalDate date1 = LocalDate.parse(date1Str);

        // Input second date
        System.out.println("Enter second date (yyyy-mm-dd): ");
        String date2Str = sc.nextLine();
        LocalDate date2 = LocalDate.parse(date2Str);

        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }
    }
}

