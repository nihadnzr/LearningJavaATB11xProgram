package ex_14_Arrays;

import java.util.Scanner;

public class Lab08_MultiplicationOFTables {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Numbers : eg:5:");
        int n= scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");

            }
            System.out.println();

        }
    }
}
