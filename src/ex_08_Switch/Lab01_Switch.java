package ex_08_Switch;

import java.util.Scanner;

public class Lab01_Switch {
    public static void main(String[] args) {
      //  int age= Integer.parseInt(args[0]);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Day (1-7)");
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wedneday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Invalid Number");
                break;

        }





    }
}
