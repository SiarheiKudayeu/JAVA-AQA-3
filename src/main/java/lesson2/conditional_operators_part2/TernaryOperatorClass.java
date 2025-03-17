package lesson2.conditional_operators_part2;

import java.util.Scanner;

public class TernaryOperatorClass {
    public static void main(String[] args) {
        // condition ? expression1 : expression2
        System.out.println("How old are you?");
        int ageFromScanner = new Scanner(System.in).nextInt();
        String resultMessage = ageFromScanner < 18 ? "You are not adult"
                : ageFromScanner > 18 ? "you are adult!" : "You are 18";
        System.out.println(resultMessage);
    }
}
