package ex_06_TernaryOperators;

public class Lab05_NumbGreater {
    public static void main(String[] args) {
        int a=34;
        int b=70;
        int c=60;

        String result= (a>=b && a>=c) ? "A is greater" : (b>=c) ? "B is greater" : "C is greater";
        System.out.println(result);
    }
}
