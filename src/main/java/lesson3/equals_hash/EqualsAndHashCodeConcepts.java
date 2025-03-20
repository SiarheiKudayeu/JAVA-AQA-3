package lesson3.equals_hash;

import lesson3.classes.Dish;

public class EqualsAndHashCodeConcepts {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Dish1", 1000, 12.0, new String[]{"One", "Two", "Three"});
        Dish dish2 = new Dish("Dish1", 1000, 10.0, new String[]{"One", "Two"});

        boolean result = dish1.equals(dish2);
        System.out.println(result);

        System.out.println("Link for one: " + dish1);
        System.out.println("Link for two: " + dish2);

        System.out.println("Hash for one: " + dish1.hashCode());
        System.out.println("Hash for two: " + dish2.hashCode());
    }
}
