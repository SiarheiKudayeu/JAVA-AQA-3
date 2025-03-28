package lesson5.generics.ex2;

public class Hobbit extends Humanoid{
    public Hobbit(String name) {
        super(name);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am Hobbit");
    }
}
