package lesson5.generics.ex2;

public class Human extends Humanoid{
    public Human(String name) {
        super(name);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am a human");
    }
}
