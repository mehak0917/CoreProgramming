package BuiltInFunction.two;

import java.util.Scanner;

public class MaxOfThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Max: " + max(a, b, c));
    }

    static int max(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}

