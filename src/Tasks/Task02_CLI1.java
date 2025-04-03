package Tasks;

public class Task02_CLI1 {
    public static void main(String[] args) {
        String Name= args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.printf("Your Name is %s%nAge is %d%nSalary is %.2f%n", Name, age, salary);


    }

}
