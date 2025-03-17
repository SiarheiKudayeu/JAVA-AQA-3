package lesson2.loops.while_do;

import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        System.out.println("Insert number:");
        int number = new Scanner(System.in).nextInt();


        while (number < 0) {
            System.out.println("While loop");
        }

        do {
            System.out.println("Do while");
        }
        while (number < 0);

    }
}
