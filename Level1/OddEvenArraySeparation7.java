package JavaArrays.Level1;
import java.util.Scanner;
public class OddEvenArraySeparation7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        System.out.print("Even Numbers: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.print("\nOdd Numbers: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }

        sc.close();

    }
}
