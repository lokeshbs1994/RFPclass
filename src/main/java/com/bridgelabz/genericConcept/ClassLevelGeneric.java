package com.bridgelabz.genericConcept;

import com.bridgelabz.OopsConcept.Demo;
import com.bridgelabz.classCompare.AddressBook;

public class ClassLevelGeneric {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 6, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0};
        String[] strings = {"abc", "abcd", "adcde"};
        print(integers);
        print(doubles);
        print(strings);

        AddressBook[] addressBook = new AddressBook[1];
        print(addressBook);

        Demo[] demos = new Demo[1];
        print(demos);
    }

    //    public static void print(Integer[] integers){
//        for (Integer integer : integers)
//            System.out.println(integer);
//    }
//
//    public static void print(Double[] integers){
//        for (Double integer : integers)
//            System.out.println(integer);
//    }
//
//    public static void print(String[] integers){
//        for (String integer : integers)
//            System.out.println(integer);
//    }
// T -> object
    public static <T> void print(T[] integers) {
        Integer integer2 = 0;
////        System.out.println(shyams.getClass());
////        System.out.println(integers.getClass());
        for (T integer : integers) {
            if (integer.getClass() == Integer.class) {
                Integer integer1 = (Integer) integer;
                integer2+=integer1;
            }else
                System.out.println(integer);
        }
        if (integer2 > 0)
            System.out.println(integer2);

    }
}


