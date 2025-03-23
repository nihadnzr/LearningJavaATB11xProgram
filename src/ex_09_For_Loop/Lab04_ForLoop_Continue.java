package ex_09_For_Loop;

public class Lab04_ForLoop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i%2==0){
                System.out.println("The number is even" +i);
                continue;
            }
            System.out.println("The number is odd" +i);

        }
    }
}
