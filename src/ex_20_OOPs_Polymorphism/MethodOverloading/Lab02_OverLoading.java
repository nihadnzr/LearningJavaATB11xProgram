package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Lab02_OverLoading {
    public static void main(String[] args) {

        MathOperation m1=new MathOperation();
        int r1=m1.add(5,5);
        int r2=m1.add(1,2,3);
        int r3=m1.add(1,2,3,4);
    }

}

class MathOperation{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}