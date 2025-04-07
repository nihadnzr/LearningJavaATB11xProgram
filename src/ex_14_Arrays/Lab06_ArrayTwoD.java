package ex_14_Arrays;

import java.sql.Array;

public class Lab06_ArrayTwoD {
    public static void main(String[] args) {
        int [][] arrays=new int[2][2];
        arrays [0][0]=3;
        arrays [0][1]=6;
        arrays [1][0]=8;
        arrays [1][1]=9;

        for (int i = 0; i < arrays.length ; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);

            }
            System.out.println();

            }

        }

    }

