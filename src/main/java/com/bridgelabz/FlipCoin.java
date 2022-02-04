package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        Scanner sc = new Scanner(System.in);//console
        int headCount = 0;
        int tailCount = 0;
        int count = sc.nextInt();//5
        for (int i = 0; i < count; i++) {//6
            double random = Math.random(); //0 to
            if (random < 0.5)
                tailCount++;
            else
                headCount++;
        }
        //  System.out.println(11f/2);//5.5
        System.out.println("percentage of tails("+ tailCount +"):"+(tailCount*100f/(headCount+tailCount)));
        System.out.println("percentage of tails("+ headCount +"):"+(headCount*100f/(headCount+tailCount)));
    }
}
