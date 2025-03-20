package lesson3.multi_dimentional_arrays;

import java.util.Arrays;

public class ArraysMultiple {
    public static void main(String[] args) {
        int[][] array = {
                {12, 3, 4},
                {13, 56, 465, 23},
                {12, 676, 4}
        };


        System.out.println(array[1][3]);
        System.out.println(array[2][0]);
        System.out.println("=====================");
        int[][] array2 = new int[4][2];
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array[i].length; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("======");
        for (int[] arrayInt: array){
            for (int number: arrayInt){
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println("================");
        System.out.println(Arrays.deepToString(array));
    }



}
