package lesson8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        System.out.println(Arrays.toString(arrayInt));

        ArrayList<Integer> arrayList = new ArrayList<>();
        //capacity == 10, ==> capacity = capacity * 1.5 +1
        System.out.println(arrayList);

        //add
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(19);
        System.out.println(arrayList);

        //set
        arrayList.set(1, 100500);
        System.out.println("ArrayList after set: " + arrayList);

        //size
        System.out.println("Size of array: " + arrayList.size());

        //remove
        arrayList.remove(1);
        System.out.println(arrayList);

        //add index
        arrayList.add(1, 4);
        System.out.println("ArrayList after add: " + arrayList);

        //init arrayList
        String[] strings = {"One", "Two", "Three"};
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println("String array list:");
        System.out.println(stringArrayList);

        //contains
        System.out.println("Do we have \"One\" inside?\n" + stringArrayList.contains("One"));



        // ArrayList - > [5, 7, 19, 23, 34]
        // LinkedList - > [5, 7, 19, 23, 25, 34]
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(19);
        System.out.println(list);

    }
}
