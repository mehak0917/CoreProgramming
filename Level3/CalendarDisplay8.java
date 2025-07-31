package JavaMethods.Level3;

import java.util.Scanner;

public class CalendarDisplay8 {

    // Method to get the month name
    public static String getMonthName(int month) {
        String[] months = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to get number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month];
    }

    // Method to calculate the first day of the month using Gregorian algorithm
    public static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday, 1=Monday, ..., 6=Saturday
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        int startDay = getStartDay(month, year);
        int numDays = getNumberOfDaysInMonth(month, year);
        String monthName = getMonthName(month);

        // Print the calendar header
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print each day of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if (((day + startDay) % 7 == 0) || (day == numDays)) {
                System.out.println();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);
    }
}

