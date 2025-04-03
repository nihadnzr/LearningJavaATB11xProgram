package Tasks;

import java.util.Scanner;

public class Task_09_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Characters");
        String charcters=scanner.next();

        int vowels=0;
        int consonants=0;
        charcters=charcters.toLowerCase();
        System.out.println(charcters);

        for (int i = 0; i <charcters.length() ; i++) {
            char ch=charcters.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                consonants++;
            }

        }
        System.out.println("Vowels is "+vowels);
        System.out.println("Consonants is "+consonants);
    }
}
