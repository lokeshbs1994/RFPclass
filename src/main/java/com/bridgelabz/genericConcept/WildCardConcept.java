package com.bridgelabz.genericConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardConcept {
    public static void main(String[] args) {
//        GenExample<? extends Object> genExample= new GenExample(); // waiting to define type
//        genExample.setT(new Integer(1));
        List<Integer> arr =  Arrays.asList(1, 2, 3);
        GenExample.print(arr);

        System.out.println("============");
//        List<String> arr1 =  Arrays.asList("abc", "agh", "weiji");
//        GenExample.print(arr1);

        System.out.println("============");
       // List arr2 =  Arrays.asList("abc", 1, new Abc());
        List arr2 = Arrays.asList(2, 1, new Abc());
        GenExample.print(arr2);
    }
}


class GenExample<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    static void print (List<? extends Number> arr){
        arr.forEach(System.out::println);
    }
}