package com.bridgelabz.OopsConcept;

import com.bridgelabz.daytwo.Day7;

public class Polymorphism {
    public static void main(String[] args) {
        //access modifier
        /**
         * Public
         */
        Day7 d=new Day7();
        System.out.println(d.hashCode());
        /*
        * private
        * */
        Demo de = new Demo();
        de.m1(1);
        /*
        * protected
        * */
        de.m1(1, 2, 3);
        /*
        * */


    }
}

class A{
    // constructor overloading
    public A(){
    }

    public A(int i){
    }

    public A(int i, int j){
    }

    //method overloading
    public void m1() {
        System.out.println("m1 with no param");
    }

    public void m1(int i) {
        System.out.println("m1 with one param");
    }

    public void m1(int i, int j) {
        System.out.println("m1 with two param");
    }
}