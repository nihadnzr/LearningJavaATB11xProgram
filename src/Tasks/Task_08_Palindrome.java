package Tasks;

import java.util.Scanner;

public class Task_08_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character, and I will tell you whether it is a palindrome or not");
        String Userinput = sc.next();
        String newString = reverseString(Userinput);
        if (newString.equalsIgnoreCase(Userinput)) {
            System.out.println("This is a palindrom");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    public static String reverseStringSB(String Userinput){
        StringBuilder stringBuilder=new StringBuilder(Userinput);
        return stringBuilder.reverse().toString();

    }

    public static String reverseString(String Userinput){
        String reversed="";
        for (int i = Userinput.length()-1; i>=0 ; i--) {
            reversed=reversed+ Userinput.charAt(i);
        }
        return reversed;
    }

}


