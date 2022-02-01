package com.bridgelabz;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Enter two numbers...");
        Scanner sc = new Scanner(System.in);
// int i1 = sc.nextInt();
        System.out.println("Your First input : " + sc.nextInt());
// int i2 = sc.nextInt();
        System.out.println("Your Second input : " + sc.nextInt());
// HelloWorld.multiply(i1, i2);
    }
    public static void multiply(int i1 , int i2){
        System.out.println(i1 * i2);
    }
}
