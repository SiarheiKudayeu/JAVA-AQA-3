package lesson8.comparator;

import lesson8.comparable.Consoles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComparator {
    public static void main(String[] args) {
        List<ConsolesComparator> consoles = new ArrayList<>();
        consoles.add(new ConsolesComparator( ConsolesComparator.Name.PLAYSTATION, 200093));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.PLAYSTATION, 2442));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.XBOX, 23234));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.SWITCH, 232));
        consoles.add(new ConsolesComparator(ConsolesComparator.Name.SWITCH, 6898));

        System.out.println(consoles);

        ComparatorCon comparatorCon = new ComparatorCon();
        consoles.sort(comparatorCon);
        System.out.println(consoles);

        Comparator<ConsolesComparator> comparator = new Comparator<ConsolesComparator>() {
            @Override
            public int compare(ConsolesComparator o1, ConsolesComparator o2) {
                return o1.name.getTitle().compareTo(o2.name.getTitle());
            }
        };

        Comparator<ConsolesComparator> comparator3 = Comparator.comparing(o -> o.name.getTitle());

        consoles.sort(comparator);
        System.out.println(consoles);

    }
}
