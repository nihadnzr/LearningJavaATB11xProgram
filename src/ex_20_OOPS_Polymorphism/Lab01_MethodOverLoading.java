package ex_20_OOPS_Polymorphism;

public class Lab01_MethodOverLoading {
    public static void main(String[] args) {
        MathOperations m1= new MathOperations();
        int r1=m1.add(7,8);
        int r2=m1.add(7,8,7);
        int r3=m1.add(7,8,7,8);

        System.out.println("Calculation of First Class"+r1);
        System.out.println("Calculation of First Class"+r2);
        System.out.println("Calculation of First Class"+r3);

    }
}
class MathOperations{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
