package ex_09_For_Loop;

public class Lab03_While {
    public static void main(String[] args) {
        int i=1;
        while (i==5){
            System.out.println("The Number is " +i);
                      i++;
            continue;
        }
        System.out.println("The number is Wrong");
    }
}
