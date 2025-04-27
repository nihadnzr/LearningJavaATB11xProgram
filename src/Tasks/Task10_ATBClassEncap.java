package Tasks;

public class Task10_ATBClassEncap {

    public static void main(String[] args) {

        ATB a_stud = new ATB();
        a_stud.Student("NIhad", 31);
        a_stud.setName("Raju");
        a_stud.setAge(44);
        System.out.println("Name is " +a_stud.getName() + " and his age is " +a_stud.getAge());

    }
}
    class ATB {

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
        private int age;

        void Student(String n, int a) {
            this.age = a;
            this.name = n;

            System.out.println("Method has been called");

        }
    }

