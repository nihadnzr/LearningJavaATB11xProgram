package Tasks;

import java.util.Scanner;

public class Task05_OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }
}
