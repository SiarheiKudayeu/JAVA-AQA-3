package lesson6.ex2;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSecondExampleClass {
    public static void main(String[] args) {

        int[] numbers = {12, 3, 44, 0, 42, -12};
        System.out.println("Enter some number:");
        try {
            int index = new Scanner(System.in).nextInt();
            System.out.println(100 / numbers[index]);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException. You insert index 3");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not existing");
        }catch (InputMismatchException e){
            System.out.println("Data type is incorrect");
        }

    }


}
