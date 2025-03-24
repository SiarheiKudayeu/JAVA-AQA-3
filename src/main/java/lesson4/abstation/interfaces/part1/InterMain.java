package lesson4.abstation.interfaces.part1;

public class InterMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.defaultMethod();
        animal.eat();
        animal.move();

        Movable[] movables = new Movable[2];
        movables[0] = new Animal();
        movables[1] = new Planet();

        for (Movable movable: movables){
            movable.move();
        }
    }
}
