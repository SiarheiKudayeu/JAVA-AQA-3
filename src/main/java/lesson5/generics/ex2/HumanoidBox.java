package lesson5.generics.ex2;

public class HumanoidBox <T extends Humanoid>{
    public static void main(String[] args) {
       HumanoidBox<Hobbit> hobbitBox = new HumanoidBox<>(new Hobbit("Frodo"));
       hobbitBox.checkInstanceType();

       HumanoidBox<Humanoid> humanoidBox = new HumanoidBox<>(new Human("Legolas"));
       humanoidBox.checkInstanceType();
    }

    private T humanoid;

    public HumanoidBox(T humanoid) {
        this.humanoid = humanoid;
    }

    public void checkInstanceType(){
        humanoid.sayWhoAmI();
    }
}
