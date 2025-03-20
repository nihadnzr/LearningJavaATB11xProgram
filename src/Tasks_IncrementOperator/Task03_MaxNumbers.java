package Tasks_IncrementOperator;

import java.util.Scanner;

public class Task03_MaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int First_number = scanner.nextInt();
        System.out.print("Enter the first number: ");
        int Second_number = scanner.nextInt();

       int result= First_number>Second_number ? First_number : Second_number;
        System.out.printf("The maximum Number is %d.%n",result);

    }
}
