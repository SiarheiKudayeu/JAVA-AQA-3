package lesson4.abstation.abstract_class.part1;

public class Car extends Vehicles {

    @Override
    void move() {
        System.out.println("I am a car.");
    }

    @Override
    void callYorName(String param) {
        System.out.println("Param is " + param);
    }
}
