package Tasks;

import java.util.Scanner;

public class Task06_TriangleTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n------To know what type of Triangle---");
        System.out.println("Enter the Length of X:");
        int x= scanner.nextInt();
        System.out.println("Enter the Length of Y:");
        int y= scanner.nextInt();
        System.out.println("Enter the Length of Z:");
        int z= scanner.nextInt();

        if(x==y && y==z && x==z){
            System.out.println("Your triangle is equilateral");
        } else if (x==y || y==z || z==x) {
            System.out.println("Your triangle is isosceles");
        }
        else {
            System.out.println("Your triangle is scalene");
        }

    }
}
