package lesson8.collections;

import java.util.*;

public class MapClassExample {
    public static void main(String[] args) {
        //HashMap does not guarantee the order of the elements
        System.out.println("HashMap");
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        System.out.println(hashMap);
        System.out.println("==============");


        //linkedHashMap guarantee the order of the elements
        System.out.println("linkedHashMap");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        System.out.println(linkedHashMap);
        System.out.println("==============");

        //TreeSet orders in ascending order by the key
        System.out.println("treeMap");
        Map<Integer, String> treeMap = new TreeMap<>();
        fillMap(treeMap);
        System.out.println(treeMap);
        System.out.println("==============");

        //for
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " : Value = " + entry.getValue());
        }

        //set of keys from Map
        Set<Integer> keys = hashMap.keySet();
        System.out.println("Set of keys from hashMap: " + keys);


        //get values
        Collection<String> valuesFromHashMap = hashMap.values();
        System.out.println(valuesFromHashMap);

        //returnValueByKey
        System.out.println(returnValueByKey(hashMap, 621));
    }

    public static String returnValueByKey(Map<Integer, String> map, Integer key) {
        String result = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                result = entry.getValue();
                break;
            }
        }
        return result;
    }

    public static void fillMap(Map<Integer, String> map) {
        map.put(1, "Sam");
        map.put(3, "Anna");
        map.put(6, "Arnold");
        map.put(22, "Misha");
        map.put(61, "Sasha");
        map.put(7, "Ruslan");
        map.put(15, "Yana");
        // map.put(6, "VALUE");
    }
}
