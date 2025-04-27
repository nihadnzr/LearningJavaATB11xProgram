package Tasks;

public class Task11_ATBArray {
    public static void main(String[] args) {

        ATB2[] students= new ATB2[3];

        students[0]=new ATB2("Nihad",31);
        students[1]=new ATB2("Jai",61);
        students[2]=new ATB2("Kissan",88);

        for(ATB2 student: students){
            System.out.println(student);
        }


    }

}

class ATB2 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ATB2(String name, int age){
        this.age=age;
        this.name=name;

    }

    public String toString(){
        return "Name is "+name+ " and the Age is" +age;
    }


}
