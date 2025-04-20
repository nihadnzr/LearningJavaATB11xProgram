package ex_18_OOPS_Constructor;

public class Lab01_DefaultConstructor {
    public static void main(String[] args) {
        A a= new A();
    }
}

class A{

     A(){
         System.out.println("Default Contructor");
     }
}
