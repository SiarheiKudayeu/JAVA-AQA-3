package lesson3.classes;

public class MainDishTest {
    public static void main(String[] args) {
        Dish myFirstDish = new Dish();
        myFirstDish.setTitle("Salted water");
        myFirstDish.getInfoAboutMe();
        String titleOfMyFirstDish = myFirstDish.getTitle();
        System.out.println(titleOfMyFirstDish);
        System.out.println(myFirstDish.getTitle());


/*        myFirstDish.title = "Salted water";
        myFirstDish.price = 100;
        myFirstDish.timeToCook = 10.0;
        myFirstDish.ingredients = new String[]{"Salt", "Water"};
        myFirstDish.getInfoAboutMe();*/
        System.out.println("+++++++++++++++++++++");
        Dish mySecondDish = new Dish("Sugar water", 120, 11.0, new String[]{"Sugar", "Water"});
        mySecondDish.getInfoAboutMe();

        System.out.println("===============");
        System.out.println(mySecondDish);


    }
}
