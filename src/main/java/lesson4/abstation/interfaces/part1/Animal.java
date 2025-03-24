package lesson4.abstation.interfaces.part1;

public class Animal implements Movable, Eatable{
    @Override
    public void move() {
        System.out.println("I am animal, I can run");
    }

    @Override
    public void eat() {
        System.out.println("Animal eat!!!");
    }
}
