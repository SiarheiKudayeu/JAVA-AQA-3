package lesson5.generics.ex1;

public class BoxMainTest {
    public static void main(String[] args) {
        SimpleBox box1 = new SimpleBox(27);
        SimpleBox box2 = new SimpleBox(44);

        box2.setObject("Test");

        System.out.println(box1.getObject() instanceof Integer);
        System.out.println(box2.getObject() instanceof Integer);

        //System.out.println((Integer) box1.getObject() + (Integer) box2.getObject());
        if(box1.getObject() instanceof Integer && box2.getObject() instanceof Integer){
            System.out.println((Integer) box1.getObject() + (Integer) box2.getObject());
        }else {
            System.out.println("Wrong data type");
        }

        GenericBox<Integer> genBox1 = new GenericBox<>(30);
        GenericBox<Integer> genBox2 = new GenericBox<>(30);
        GenericBox<String> genBox3 = new GenericBox<>("Text");

        //genBox2.setObject("saasdsa");

        System.out.println(genBox1.getObject() + genBox2.getObject());
        System.out.println(genBox1.getObject() + genBox3.getObject());

    }
}
