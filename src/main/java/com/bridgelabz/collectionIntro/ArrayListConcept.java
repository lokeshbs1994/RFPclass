package com.bridgelabz.collectionIntro;

import com.bridgelabz.HelloWorld;
import com.bridgelabz.OopsConcept.Demo;

import java.util.*;

public class ArrayListConcept {
    public static void main(String[] args) {
        //Array
        /**
         * homogeneous
         * while initiation, we have to declare the size(not flexible in size)
         */
        int[] arr = new int[9];
        arr[6] = 7;
        int i = 'a';
        /**
         * Arraylist
         * heterogeneous
         * flexible in size
         * implement iterator:
         *  ** It will only store object.. not any primitive data types
         */
        ArrayList arrayList = new ArrayList();
        //arrayList.add(new Demo().m1(1).toUpperCase(Locale.ROOT));
        arrayList.add(new HelloWorld());
        arrayList.add(1);
        arrayList.add("Lokesh");
        arrayList.add("rama");
        // inheritance - > Object obj = new child
//         for (Object v : arrayList){
////             Demo demo = (Demo) v;
////             System.out.println(demo.m1(1).toUpperCase(Locale.ROOT));
////             System.out.println(v);
//         }
//        Iterator iterator = arrayList.iterator();
//         while (iterator.hasNext())
//             System.out.println(iterator.next());
        /**
         * we can make arraylist homogeneous
         */
        ArrayList<Integer> intergers2 = new ArrayList<>();
        intergers2.add(1);
        intergers2.add(12);
        intergers2.add(null);
        ArrayList<Integer> intergers = new ArrayList<>();
        intergers.add(1);
        intergers.add(12);
        intergers.add(null);
        intergers.add(null);

        intergers.addAll(intergers2);

        System.out.println(intergers.get(0));
        System.out.println(intergers.size());
       // System.out.println(intergers);
        for (Integer v : intergers) {
            System.out.println(v != null ? v : "empty");
        }
        System.out.println("===============");
        Iterator<Integer> iterator = intergers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("===================");
        intergers.removeIf(v -> v == null);
        for (Integer v : intergers){
            System.out.println(v != null ? v : "empty");
        }
        // key value pair -> key will be unique, vulue will be unique or duplicate
        // null as key only once
        HashMap<String, String> add = new HashMap<>();
        add.put("Lokesh", "karnataka");
        add.put("mohan", "goa");

        for (Map.Entry<String, String> entry : add.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        HashMap<String, Integer> add2 = new HashMap<>();
        add2.put("Lokesh", 1);
        add2.put("mohan", 2);
        add2.put("bjbd", 3);

        Integer integer = add2.get("mohan");
        add2.put("mohan", integer+4);

        Set<String> strings = add2.keySet();
// set is same as Arraylist but doesnot allow duplicate value

        for (Map.Entry<String, Integer> entry : add2.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
