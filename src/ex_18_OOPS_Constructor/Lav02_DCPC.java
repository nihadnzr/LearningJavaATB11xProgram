package ex_18_OOPS_Constructor;

public class Lav02_DCPC {
    public static void main(String[] args) {
        //Person p1=new Person();
        //p1.PrintallDetails();
        //new Person().PrintallDetails();
        Person p2= new Person("Nihad",31,"Alleppey",87565167,true);
        p2.PrintallDetails();
        p2.eat();
        p2.sleep();
        //System.out.println(p1.name);

    }
}

class Person {
    String name;
    int age;
    String address;
    long phone;
    boolean Ismale;

    void eat(){
        System.out.println(name+ " is Eating");
    }
    void sleep(){
        System.out.println(name+ " is Sleeping");
    }
    void doHome(){
        System.out.println(name+ " will do homework");
    }
    void PrintallDetails(){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Address is " +age);
        System.out.println("Phone no " +phone);
        System.out.println("Gender is Male : " +Ismale);
    }

    Person(){
        name="Unknown";
        age=00;
        address="Unknown";
        phone=12345679;
        Ismale=false;

    }
    Person(String name_pc,int age_pc,String address_pc,long phone_pc,boolean ismale_pc){

        this.name=name_pc;
        this.age=age_pc;
        this.address=address_pc;
        this.phone=phone_pc;
        this.Ismale=ismale_pc;

    }

}
