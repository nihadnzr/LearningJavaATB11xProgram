package ex_11_Functions;

import javax.swing.plaf.synth.SynthIcon;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lab04_DiffFuncs {
    public static void main(String[] args) {
        WPWR();
        String result = WITHOUTPWITR();
        System.out.println(result);
        WITHPWITHOUTR("Nihad",30,42.00);
        int total =WITHPWITHR(1,4,6);
        System.out.println(total);
    }

    static void WPWR(){
        System.out.println("Hello World");
    }

    static String WITHOUTPWITR(){
        System.out.println("Hi");
        return "i'm fine";
    }

    static void WITHPWITHOUTR(String name,int age, double salary){
        System.out.println("Your name is"+name+"\nYour age is"+age+"\nYour salary is" +salary);
    }

    static int WITHPWITHR(int a, int b,int c){
        return a+b+c;
    }
}
