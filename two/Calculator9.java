package BuiltInFunction.two;

import java.util.Scanner;

public class Calculator9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(sub(a, b)); break;
            case '*': System.out.println(mul(a, b)); break;
            case '/': System.out.println(div(a, b)); break;
            default: System.out.println("Invalid");
        }
    }

    static int add(int x, int y) { return x + y; }
    static int sub(int x, int y) { return x - y; }
    static int mul(int x, int y) { return x * y; }
    static int div(int x, int y) { return y != 0 ? x / y : 0; }
}
