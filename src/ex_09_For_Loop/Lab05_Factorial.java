package ex_09_For_Loop;

import java.util.Scanner;

public class Lab05_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the Number");
        int num = scanner.nextInt();
        int factorial = 1;
        if (num <= 0) {
            System.out.println("Factorial is " + factorial);
        } else {
            for (int i = 1; i <=num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial is " +factorial);
        }
    }

}
