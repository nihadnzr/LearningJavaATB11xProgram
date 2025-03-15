package ex_01_Java_Basic;

public class Java_MathFunc {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z= 10;

        double value=Math.pow(x,2) + Math.pow(y,2) - Math.abs(z);

        double result=Math.cbrt(value);

        System.out.println("Result is :"+result);

    }
}
