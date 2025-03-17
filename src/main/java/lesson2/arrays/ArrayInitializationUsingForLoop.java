package lesson2.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayInitializationUsingForLoop {
    public static void main(String[] args) {

        int[] arrayInt = {12, 77, 2, 5454};
        System.out.print("[");
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.print("\b\b");
        System.out.print("]");

        //Initialize array with help of loop
        System.out.println();


/*        Random random = new Random();
        int randomInt = random.nextInt(-100, 100);
        System.out.println(randomInt);*/

        int[] arrayLoop = new int[10];
        System.out.println(Arrays.toString(arrayLoop));
        Random random =  new Random();
        for (int i = 0; i < arrayLoop.length; i++){
            arrayLoop[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arrayLoop));
    }
}
