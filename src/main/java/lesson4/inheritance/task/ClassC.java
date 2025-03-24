package lesson4.inheritance.task;

public class ClassC extends ClassB{
    public ClassC(){
        System.out.println("Constructor class C");
    }

    static {
        System.out.println("Static block C");
    }
}
