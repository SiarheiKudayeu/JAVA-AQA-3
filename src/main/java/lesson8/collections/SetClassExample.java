package lesson8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassExample {
    public static void main(String[] args) {
        //HashSet does not guarantee the order of the elements
        Set<String> hashSet = new HashSet<>();
        fillSet(hashSet);
        System.out.println("HashSet:");
        System.out.println(hashSet);
        System.out.println("==================");

        //LinkedHashSet guarantee the order of the elements
        Set<String> linkedHashSet = new LinkedHashSet<>();
        fillSet(linkedHashSet);
        System.out.println("LinkedHashSet:");
        System.out.println(linkedHashSet);
        System.out.println("==================");

        //TreeSet orders in ascending order
        Set<String> treeSet = new TreeSet<>();
        fillSet(treeSet);
        System.out.println("TreeSet:");
        System.out.println(treeSet);
        System.out.println("==================");
    }


    public static void fillSet(Set<String> set){
        set.add("plane");
        set.add("bicycle");
        set.add("bus");
        set.add("car");
        set.add("auto");
        set.add("ship");
        set.add("helicopter");
        set.add("boat");
        set.add("shoes");
        //set.add("bicycle");
    }
}
