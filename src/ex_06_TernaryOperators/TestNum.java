package ex_06_TernaryOperators;

public class TestNum {
    public static void main(String[] args) {
        int n1 = 34;
        int n2 = 70;
        int n3 = 60;

        String result = String.valueOf((n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3));
        System.out.println(result);
    }
}
