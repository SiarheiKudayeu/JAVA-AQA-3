package lesson2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassLessonTwo {
    public static void main(String[] args) {
        int[] arrayInt = new int[6];
        System.out.println(Arrays.toString(arrayInt));

        int[] arrayInt2 = {12, 77, 2, 5454};
        System.out.println(Arrays.toString(arrayInt2));

        //   [12, 77, 2, 5454]
        System.out.println(arrayInt2[3]);

        String[] textArray = new String[3];
        String[] textArray2 = {"Text1", "Text2", "Text3"};

        Scanner[] scanners = {new Scanner(System.in), new Scanner(System.in)};

        System.out.println(arrayInt2.length);
        System.out.println(arrayInt.length);

    }
}
