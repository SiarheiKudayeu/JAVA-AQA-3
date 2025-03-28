package lesson5.generics.ex2;

public abstract class Humanoid {
    protected String name;

    public Humanoid(String name) {
        this.name = name;
    }

    public abstract void sayWhoAmI();
}
