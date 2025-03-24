package lesson4.abstation.abstract_class.part1;

public class AbstractMethodMain {
    public static void main(String[] args) {
        //Vehicles vehicles = new Vehicles();
        Car car = new Car();
        car.move();
        Plane plane = new Plane();
        plane.move();
        car.callYorName("PARAM!!!");
    }
}
