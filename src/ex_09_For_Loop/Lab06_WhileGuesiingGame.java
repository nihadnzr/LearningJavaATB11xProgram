package ex_09_For_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab06_WhileGuesiingGame {
    public static void main(String[] args) {
        Random random= new Random();
        int numbertoGuess= random.nextInt(50)+1;
        System.out.println(numbertoGuess);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int guess;
        int attempts=0;
        while (true){
            guess= scanner.nextInt();
            attempts++;

            if (guess<numbertoGuess){
                System.out.println("Your number is low");
            }
            else if(guess>numbertoGuess) {
                System.out.println("Your number is High");
            }else {
                System.out.println("Correct!! Your guess is right");
            }
        }
    }
}
