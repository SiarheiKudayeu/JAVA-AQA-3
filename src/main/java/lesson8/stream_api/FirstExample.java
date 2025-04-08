package lesson8.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FirstExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 33, 32, 12, 7, 4, 33));

        Stream<Integer> integerStream = integers.stream();

        //Stream operations
        //filtering
        List<Integer> result = integerStream.filter(integer -> integer % 2 == 0)
                .toList();
        System.out.println(result);

        //map
        result = integers.stream()
                .map(n -> n + 2)
                .toList();

        //sort()
        System.out.println(result);
        result = integers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted collection: " + result);

        //sort()
        result = integers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sorted collection: " + result);


        //distinct
        result = integers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct: " + result);


        //terminal operations
        //toList()
        result = integers.stream().toList();
        System.out.println(result);

        //forEach
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
