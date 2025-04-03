package ex_14_Arrays;

public class Lab03_MaxMinArray {
    public static void main(String[] args) {
        int [] array={32,76,45,65,98,54};

        int maxout=givemaximum(array);
        int minout=giveminimum(array);
        System.out.println(maxout);
        System.out.println(minout);
    }

     static int givemaximum(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
    static int giveminimum(int[] array) {
        int min=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }
}
