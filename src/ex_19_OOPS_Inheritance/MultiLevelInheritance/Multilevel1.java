package ex_19_OOPS_Inheritance.MultiLevelInheritance;

public class Multilevel1 {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather();
        gf.GF();

        System.out.println("------");

       Father f1=new Father();
       f1.F();
       GrandFather g1=new Son();
       g1.home();
       Son s1=new Son();
       s1.GF();
       s1.F();
       s1.S();
    }
}
