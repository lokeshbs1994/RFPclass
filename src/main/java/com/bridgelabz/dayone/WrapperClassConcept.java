package com.bridgelabz.dayone;

import com.bridgelabz.daytwo.Calculation;

import java.sql.SQLOutput;

public class WrapperClassConcept {
    public static Integer i= 90;
    public static void main(String[] args) {
        // int --> primitive  4 bytes
        // Integer
        WrapperClassConcept abc = new WrapperClassConcept();
        //com.bridgelabz.daytwo.WrapperClassConcept.divide(1,3);
        Calculation.divide(4,2);
        abc.sum(1, 3);
        //System.out.println(abc.sum(1,3));
        multiply(1, 3);

        System.out.println("---------------------------");
        //local variable
        Integer i= 10;
        System.out.println("----->"+i);
        System.out.println("------->"+ WrapperClassConcept.i);
        Integer i2=23;
        Integer d=compareNumber(10,23);
        System.out.println(d);//-1
        d=compareNumber(11,0);
        System.out.println(d);//1
        d=compareNumber(10,10);
        System.out.println(d);//0
        d=compareNumber(-10,-23);
        System.out.println(d);//1
        d=compareNumber(-10,23);
        System.out.println(d);//-1
    }

    public static Integer compareNumber(Integer i, Integer i1) {
        System.out.println("==============1===============");
        System.out.println("=================2============");
        System.out.println("=================3============");
        System.out.println("===================4==========");
        return i.compareTo(i1);
    }

    // Method area--> only store all static field along with class, heap area
    // jvm -> execute
    public void sum(int a, int b) {
        System.out.println(a * b);
    }// stored in heap area
    // method - function
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
}
//class ->
class second{
    public static void sum(int a, int b){
        //block
        System.out.println(a + b);
    }
}