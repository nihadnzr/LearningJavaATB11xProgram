package ex_20_OOPS_Polymorphism;

public class Lab02_MethodOverRiding {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();

    }

}
class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}