package com.bridgelabz.daytwo;

public class BasicConditionConcept {
    public static void main(String[] args) {
     //   int i=0;
        Integer i = 3;
//        System.out.println(i++);// 0
//        System.out.println(++i);// 2


       //  evenNumber(i != null ?i : 0);
//        switchExample(i);
  //      System.out.println(10/i);
        //ternary operator
       // Integer integer=null;
       // System.out.println(integer.equals(1));
       // System.out.println(i%2 == 0? "Even num": "odd num");
        System.out.println(i == 0 ? "0" : i == 1 ? "1" : i == 2 ? "2" : "other");
    }

    public static void switchExample(int i) {
        switch (i){
            case 0 :
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("other");
        }
    }

    private static void evenNumber(int i) {
        if(i == 0) {
            System.out.println("0");
        }else if(i == 1) {
            System.out.println("1");
        }else if(i==2) {
            System.out.println("2");
        }else if(i==3) {
            System.out.println("3");
        }else if(i==4) {
            System.out.println("4");
        }else if(i==5) {
            System.out.println("5");
        }else {
            System.out.println("Other");
        }

        }
    }

