package lesson8.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleComparableClass {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 55, -14));

        Collections.sort(integers);
        System.out.println(integers);

        List<Consoles> consoles = new ArrayList<>();
        consoles.add(new Consoles( Consoles.Name.PLAYSTATION, 200093));
        consoles.add(new Consoles(Consoles.Name.PLAYSTATION, 2442));
        consoles.add(new Consoles(Consoles.Name.XBOX, 23234));
        consoles.add(new Consoles(Consoles.Name.SWITCH, 232));
        consoles.add(new Consoles(Consoles.Name.SWITCH, 6898));


        Collections.sort(consoles);
        System.out.println(consoles);
    }
}
