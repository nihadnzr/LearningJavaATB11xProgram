package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Lab01_OverRiding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
    }
}

class Animal {
    void Sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("Bark");
    }
}
