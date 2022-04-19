package com.bridgelabz.collectionconcept;

import java.util.*;

public class SetConcept {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        Set<DemoComp> set2 = new TreeSet<>();
        set2.add(new DemoComp(1));
        set2.add(new DemoComp(2));

        for (DemoComp d : set2) {
            System.out.println(d.getValue1());
        }
    }

}
