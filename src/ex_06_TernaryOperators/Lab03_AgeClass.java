package ex_06_TernaryOperators;

public class Lab03_AgeClass {
    public static void main(String[] args) {
        String age1=args[0];
        System.out.println(age1 instanceof String);
        System.out.println(age1);

        int age=Integer.parseInt(age1);

        String result=(age<18) ? "Minor":(age<65)?"Adult":"Senior";
        System.out.println(result);
    }
}
