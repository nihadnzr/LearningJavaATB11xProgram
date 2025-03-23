package ex_09_For_Loop;

import java.util.Scanner;

public class Lab07_Fibnoacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welocome to Fibnoacci Program\n Enter the number of Terms:");
        int n= scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibnoacci Series: " + first + "," + second);
        for (int i = 2; i < n; i++) {
            int next=first+second;
            System.out.print(","+next);
            first=second;
            second=next;


        }
        scanner.close();
    }
}
