package lesson8.iterator;

import java.util.*;

public class IteratorExample {
    //next()
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Two"))
                iterator.remove();
        }
        System.out.println(list);



        List<String> list2 = new ArrayList<>(Arrays.asList("One" , "Two", "Three"));
        ListIterator<String> iterator2 = list2.listIterator();
        while (iterator2.hasNext()){
            if(iterator2.next().equals("One")){
                iterator2.add("NEW VALUE");
            }
        }
        System.out.println(list2);

    }
}
