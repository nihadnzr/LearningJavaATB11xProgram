package ex_14_Arrays;

import java.util.Arrays;

public class Lab05_LargestinArray {
    public static void main(String[] args) {
        int [] numbers={12,34,13,43,432,123,1235};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
