package lesson3.method_overloading;

public class MethodOverloadingClass {
    public static void main(String[] args) {
        doSmth();
        System.out.println("===============");
        doSmth("TEST STRING");
        System.out.println("===============");
        doSmth("TEST STRING", 123);
        System.out.println("===============");
        doSmth(123, "123");
    }

    public static void doSmth(){
        System.out.println("I am empty method");
    }

    public static void doSmth(String arg){
        System.out.println("I am method with one argument: " + arg);
    }

    public static void doSmth(String arg, int number){
        System.out.println("I am method with one argument: " + arg);
        System.out.println("I am method with second argument: " + number);
    }

    public static void doSmth(int number, String arg){
        System.out.println("I am method with one argument: " + arg);
        System.out.println("I am method with second argument: " + number);
    }



}
