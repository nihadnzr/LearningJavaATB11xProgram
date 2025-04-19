package ex_17_OOPS;

public class Lab02_ClassPerson {

    public static void main(String[] args) {
        // Creating object
        Person p = new Person();

        // Assigning values manually
        p.name = "Nihad";
        p.age = 31;
        p.address = "Malikaveed";
        p.sex = "Male";
        p.salary = 100000;
        p.email = "nihad@gmail.com";
        p.nationality = "Indian";
        p.height = 167.3;
        p.weight = 67;
        p.isEmployed = true;

        // Method calls
        p.displayDetails(); // 1. Without parameters, without return
        double LPA = p.calculateLPA(); // 2. Without parameters, with return
        System.out.println("Annual Salary (LPA): " + LPA);

        p.updateEmail("nihadnzr1@gmail.com"); // 3. With parameters, without return

        boolean isOlder = p.isOlderThan(25); // 4. With parameters, with return
        System.out.println("Is older than 25? " + isOlder);
    }
}

class Person {
    // Attributes
    String name;
    int age;
    String address;
    String sex;
    float salary;
    String email;
    String nationality;
    double height;
    double weight;
    boolean isEmployed;

    // 1. Without Parameters and Without Return Type
    void displayDetails() {
        System.out.println("----- Person Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + sex);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + email);
        System.out.println("Nationality: " + nationality);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Employed: " + isEmployed);
        System.out.println("--------------------------");
    }

    // 2. Without Parameters but With Return Type
    double calculateLPA() {
        return salary * 12;
    }

    // 3. With Parameters and Without Return Type
    void updateEmail(String newEmail) {
        email = newEmail;
        System.out.println("Your updated email is " + email);
    }

    // 4. With Parameters and With Return Type
    boolean isOlderThan(int compareAge) {
        return age > compareAge;
    }
}