package ex_14_Arrays;

import java.util.Scanner;

public class La04_ArrayUserInputs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Numbers (Araay int only)");
        int size= sc.nextInt();

        int [] number_marks=new int[size];
        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the numbers");
            number_marks[i]=sc.nextInt();     }
        System.out.println("------");
        for (int i = 0; i <number_marks.length;i++){
            System.out.println(number_marks[i]);

        }
sc.close();
}
}

