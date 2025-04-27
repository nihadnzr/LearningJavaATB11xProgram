package Tasks;

public class Task12_OverLoadingOverRiding {
    public static void main(String[] args) {
        ATB3[] students = new ATB3[3];

        students[0] = new ATB3("Nihad", 31);
        students[1] = new ATB3("Jai", 61);
        students[2] = new ATB3("Kissan", 88);

        for (ATB3 student : students) {
            System.out.println(student);
        }

        System.out.println();

        students[0].printInfo();
        students[0].printInfo("A+");

        Trainer trainer = new Trainer("Sharma", 40, "Java");
        System.out.println(trainer);

        SeniorTrainer senior = new SeniorTrainer("Meena", 45, "Python", 12);
        System.out.println(senior);

        Coordinator coord = new Coordinator("Riya", 30, "Project Coordination");
        coord.showRole();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showRole() {
        System.out.println("I am a person.");
    }
}

class ATB3 extends Person {

    public ATB3(String name, int age) {
        super(name, age);
    }

    void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    void printInfo(String grade) {
        System.out.println(name + " is " + age + " years old and got grade " + grade);
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age;
    }
}

class Coordinator extends Person {

    String responsibility;

    Coordinator(String name, int age, String responsibility) {
        super(name, age);
        this.responsibility = responsibility;
    }

    @Override
    void showRole() {
        System.out.println(name + " is a Coordinator for: " + responsibility);
    }
}

class Trainer extends Person {

    String subject;

    Trainer(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer Name: " + name + ", Age: " + age + ", Subject: " + subject;
    }
}

class SeniorTrainer extends Trainer {

    int experience;

    SeniorTrainer(String name, int age, String subject, int experience) {
        super(name, age, subject);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Senior Trainer: " + name + ", Age: " + age + ", Subject: " + subject + ", Experience: " + experience + " years";
    }
}
