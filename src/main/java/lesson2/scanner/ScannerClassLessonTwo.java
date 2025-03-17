package lesson2.scanner;

import java.util.Scanner;

public class ScannerClassLessonTwo {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);

 /*       //integers nextInt()
        System.out.println("Insert your number:");
        int numberFromKeyboard = scanner.nextInt();
        System.out.println("Your number is: " + numberFromKeyboard);*/

/*        //String nexLine()
        System.out.println("Insert your text:");
        String textFromKeyboard = scanner.nextLine();
        System.out.println("Your text is: " + textFromKeyboard);*/

        //input String next()
        System.out.println("Insert your text:");
        String textFromKeyboard = scanner.next();
        System.out.println("Your text is: " + textFromKeyboard);
        textFromKeyboard = scanner.next();
        System.out.println("Your text is: " + textFromKeyboard);
        textFromKeyboard = scanner.nextLine();
        System.out.println("Your text is: " + textFromKeyboard);
    }
}
