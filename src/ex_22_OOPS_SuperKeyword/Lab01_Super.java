package ex_22_OOPS_SuperKeyword;

public class Lab01_Super {
    public static void main(String[] args) {
        Dog a= new Dog();
        a.display();
    }
}

class Animal{
    protected String color ="White";

    void sound(){
        System.out.println("Sound Play");
    }
}
class Dog extends Animal{
    private String color="Black";
    void display() {
        System.out.println(super.color);
        super.sound();
    }

}