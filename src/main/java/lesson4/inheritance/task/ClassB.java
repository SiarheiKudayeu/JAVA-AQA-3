package lesson4.inheritance.task;

public class ClassB extends ClassA{
    public ClassB(){
        System.out.println("Constructor class B");
    }

    static {
        System.out.println("Static block B");
    }
}
