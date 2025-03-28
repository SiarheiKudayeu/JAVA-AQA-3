package lesson5.generics.ex3;

import lesson5.generics.ex1.GenericBoxWithTwoArgs;
import lesson5.generics.ex2.Elf;
import lesson5.generics.ex2.Hobbit;
import lesson5.generics.ex2.Human;
import lesson5.generics.ex2.Humanoid;

public class GenericMethods {
    public static void main(String[] args) {
        printValueDataType(new Elf("Elf"));
        printValueDataTypeTwoArgs(123, "Text");
        playWithHuman(new Human("Alex"));
        methodWithGenericClass(new GenericBoxWithTwoArgs<>("Text", 123));
        methodWithGenericClassWildCarts(new GenericBoxWithTwoArgs<>(new Hobbit("Frodo"),1233));
    }

    public static <T> void printValueDataType(T variable) {
        System.out.println(variable.getClass().getName());
    }

    public static <T, T1> void printValueDataTypeTwoArgs(T variable1, T1 variable2) {
        System.out.println("Variable1 " + variable1.getClass().getName());
        System.out.println("Variable2 " + variable2.getClass().getName());
    }

    public static <T extends Humanoid> void playWithHuman(T variable) {
        variable.sayWhoAmI();
    }

    public static void methodWithGenericClass(GenericBoxWithTwoArgs<String, Integer> box){
        box.printAllFieldsTypes();
    }

    public static void methodWithGenericClassWildCarts(GenericBoxWithTwoArgs<? extends Humanoid, ?> box){
        box.printAllFieldsTypes();
    }
}
