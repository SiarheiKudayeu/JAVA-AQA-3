package lesson3.static_word.blocks;

import java.util.Date;

public class StaticBlocksOfCode {

    public static Date date;

    public StaticBlocksOfCode(){
        System.out.println("I am constructor");
    }

    static {
        date = new Date();
        System.out.println("I am static block!");
    }

    public static void method(){
        System.out.println("I am static method");
    }
}
