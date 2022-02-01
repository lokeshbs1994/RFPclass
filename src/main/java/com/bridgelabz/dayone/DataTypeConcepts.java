package com.bridgelabz.dayone;

import java.awt.*;

public class DataTypeConcepts {
    public static void main(String[] args) {
        //datatype 0 & 1
        //int,long, char, double, long, short, boolean, float-primitive data type
        //int v/s long--> int -4 byte// long- 8byte
        //1 byte = 8bits
        //4-100//5-101
        //String
        int i = 21;
        System.out.println(Integer.MAX_VALUE);
        long j = 1121334344546576L;
        System.out.println(Long.MAX_VALUE);
        double x = 192.09191;// 192
        double y = -39.28;
        System.out.println("Floor : " + Math.floor(y));
        System.out.println("Random : " + Math.random());
        System.out.println("Random : " + Math.floor(Math.random()));
        System.out.println("Random : " + (int)Math.floor(Math.random()*10)%2);
        //(int) typecasting
        //Math.floor();

        // Wrapper Class:
        // int -> Integer
        //long ->Long
        //double -> Double
        //int in1=null;
        //Integer integer= 10; //pointer
        // copareTo() // 0 for equal, -ve for lesser and +ve for greater
        int i1=10;
        Integer integer3=i1;
        Integer integer = new Integer(10);//pionter
        Integer integer2 =integer ;
        integer2=26;
        System.out.println("compare output : "+integer.compareTo(integer2));
        System.out.println("compare output : "+integer2.compareTo(integer));
        System.out.println(integer);
        System.out.println(integer2);

        User user = new User();
        user.setInteger(10);

        User user1=user;
        System.out.println(user1);
        System.out.println(user);
        System.out.println("=======================");
        user1.setInteger(26);
        System.out.println(user1.getInteger());
        System.out.println(user.getInteger());
    }
}

class User extends Object{
    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    private Integer integer;
}