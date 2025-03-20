package lesson3.classes;

import java.util.Arrays;
import java.util.Objects;

public class Dish {
    private String title;
    private int price;
    private double timeToCook;
    private String[] ingredients;

    public Dish(int price) {
        this.price = price;
    }

    public Dish(String title, int price, double timeToCook, String[] ingredients) {
        //System.out.println("My constructor");
        this.title = title;
        this.price = price;
        this.timeToCook = timeToCook;
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return price == dish.price && Objects.equals(title, dish.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

/*    @Override
    public String toString() {
        return "ingredients = " + Arrays.toString(ingredients) +
                ", \ntimeToCook = " + timeToCook +
                ", \nprice = " + price +
                ", \ntitle = '" + title;
    }*/

    public Dish(String title, String[] ingredients) {
        this(123);
        this.title = title;
        this.ingredients = ingredients;
        this.timeToCook = 12.0;
    }

    public Dish() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(double timeToCook) {
        this.timeToCook = timeToCook;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void getInfoAboutMe() {
        System.out.println("My title:" + title);
        System.out.println("My price:" + price);
        System.out.println("My timeToCook:" + timeToCook);
        System.out.println("My ingredients:" + Arrays.toString(ingredients));
    }
}
