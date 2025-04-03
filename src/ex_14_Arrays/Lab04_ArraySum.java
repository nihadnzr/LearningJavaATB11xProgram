package ex_14_Arrays;

public class Lab04_ArraySum {
    public static void main(String[] args) {
        int [] mark={31,32,34};
        int sum=0;
//        for (int i = 0; i < mark.length; i++) {
//            sum=sum+mark[i];
//        }
//        System.out.println(sum);
        for (int n : mark){
            sum=sum+n;
        }
        System.out.println(sum);



    }
}
