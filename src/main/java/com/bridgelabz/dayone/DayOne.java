package com.bridgelabz.dayone;

import java.util.Scanner;
import com.bridgelabz.HelloWorld;

public class DayOne {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Enter two numbers...");
        Scanner sc = new Scanner(System.in);
int i1 = sc.nextInt();
        System.out.println("Your First input : " + sc.nextInt());
int i2 = sc.nextInt();
        System.out.println("Your Second input : " + sc.nextInt());
HelloWorld.multiply(i1, i2);
    }
}
