package lesson8.comparator;

import java.util.Comparator;

public class ComparatorCon implements Comparator<ConsolesComparator> {
    @Override
    public int compare(ConsolesComparator o1, ConsolesComparator o2) {
        return o2.cost - o1.cost;
    }
}
