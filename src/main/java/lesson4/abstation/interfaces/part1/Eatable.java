package lesson4.abstation.interfaces.part1;

public interface Eatable {
    void eat();

    default void defaultMethod(){
        System.out.println("Smth default");
    }
}
