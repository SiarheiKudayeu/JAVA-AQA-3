package lesson2.method_creation;

import java.util.Scanner;

public class MethodCreationClass {
    public static void main(String[] args) {
   /*     int tryMethodOne = returnIntegerFromConsole();
        System.out.println(tryMethodOne);*/

/*        int methodTwo = returnMethodTwo(33, 3);
        System.out.println(methodTwo);*/

       /* returnMethodThree();*/

        returnMethodFour("Test", 455);
    }

    //1) with returning value, no arguments
    public static int returnIntegerFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert any number!");
        int numberFromScanner = scanner.nextInt();
        return numberFromScanner;
    }

    //2) with returning value, with arguments
    public static int returnMethodTwo(int numberOne, int multipleNumber){
        System.out.println("with returning value, with arguments");
        return numberOne * multipleNumber;
    }

    //3) no returning value, no arguments
    public static void returnMethodThree(){
        System.out.println("no returning value, no arguments");
    }

    //4)no returning value, no arguments
    public static void returnMethodFour(String argumentOne, int argumentTwo){
        System.out.println("Argument one: " + argumentOne);
        System.out.println("Argument two: " + argumentTwo);
    }
}
