package ex_06_TernaryOperators;

public class Lab04_GradeCalculator {
    public static void main(String[] args) {
        String mark1=args[0];
        int mark=Integer.parseInt(mark1);

        //
        String result=(mark>=90 && mark<=100) ? "Your Grade is A":
                      (mark>=80 && mark<=89)  ? "Your Grade is B":
                      (mark>=70 && mark<=79)  ? "Your Grade is C":
                      (mark>=60 && mark<=69)  ? "Your Grade is D": "Your Grade is F";

        System.out.println(result);

    }
}
