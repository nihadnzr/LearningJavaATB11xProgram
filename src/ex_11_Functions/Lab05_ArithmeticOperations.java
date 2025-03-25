package ex_11_Functions;

import java.util.Scanner;

public class Lab05_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter a valid number");
            System.exit(0);
        }

        System.out.println("Enter the Second Number:");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter a valid number");
            System.exit(0);
        }

        int sumResult = Sum(a, b);
        System.out.println("Total is " + sumResult);

        int SubResult = Sub(a, b);
        System.out.println("Sub is " + SubResult);

        int MultResult = Mult(a, b);
        System.out.println("Mult is " + MultResult);

        try {
            int DivResult = Div(a, b);
            System.out.println("Div is " + DivResult);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int ModResult = Mod(a, b);
            System.out.println("Mod is " + ModResult);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static int Sum(int a, int b) {
        return a + b;
    }

    static int Sub(int a, int b) {
        return a - b;
    }

    static int Mult(int a, int b) {
        return a * b;
    }

    static int Div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    static int Mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }
        return a % b;
    }
}
