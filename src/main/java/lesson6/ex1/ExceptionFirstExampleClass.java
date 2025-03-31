package lesson6.ex1;

import lesson5.generics.ex1.SimpleBox;

import java.util.Scanner;

public class ExceptionFirstExampleClass {
    public static void main(String[] args) {

/*        //Arithmetic exception
        System.out.println(14/0);*/

/*        //ArrayIndexOutOfBoundsException
        int[] array = new int[3];
        System.out.println(array[9]);*/

/*        //ClassCast exception
        SimpleBox box1 = new SimpleBox(27);
        SimpleBox box2 = new SimpleBox("44");
        System.out.println((Integer) box1.getObject() + (Integer) box2.getObject());*/

        int x = 12;
        System.out.println("Please enter some number:");
        int y = new Scanner(System.in).nextInt();
        try {
            System.out.println(x/y);
            System.out.println("Result of division is :" + x/y);
            int[] array = new int[3];
            System.out.println(array[y]);
        }catch (ArithmeticException exception){
            System.out.println("Exception message is:");
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Finally Block!!!!");
        }
        System.out.println("Let's continue");
    }
}
