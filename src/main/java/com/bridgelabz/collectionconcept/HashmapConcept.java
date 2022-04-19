package com.bridgelabz.collectionconcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapConcept {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("A", "Avinash");
        map.put("B", "Bhanu");
        map.put("C","chetu");
        map.put("D", "Avinash");
        map.put("A", "Anand");
        map.put(null, "Anand");
        System.out.println(map.get("A"));
        System.out.println(map.containsKey("E"));// false
        System.out.println(map.get("E"));
        Set<String> strings = map.keySet();
        for (Map.Entry<String, String> m : map.entrySet())
            System.out.println(m.getKey() + ":" + m.getValue());
        System.out.println(map);
    }
}
