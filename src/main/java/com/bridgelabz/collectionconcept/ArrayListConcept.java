package com.bridgelabz.collectionconcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(19);
        arrayList.add(19);
        arrayList.add(19);
        arrayList.add(19);
        List<Integer> list = new ArrayList<>();
        list.add(12); //Interger
        System.out.println(list);
        list.addAll(arrayList);
        System.out.println(list);

        List list1 = null;// not pointing to any memory location in RAM
        List list2 = new ArrayList();// pointing
        //list.get(199); // Index 199 out of bounds for length 5
        System.out.println(list2.isEmpty());

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);


    }
}

/**
 * collection (I) -> List(I), Queue, set
 * ArrayList, LinkedList, Vector, Stack
 */