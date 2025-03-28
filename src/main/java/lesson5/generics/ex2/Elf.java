package lesson5.generics.ex2;

public class Elf extends Humanoid{
    public Elf(String name) {
        super(name);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println(" I am elf");
    }
}
