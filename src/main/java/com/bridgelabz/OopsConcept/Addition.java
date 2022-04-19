package com.bridgelabz.OopsConcept;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition addition = new Addition();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = addition.add(num1, num2);
    }
    public int add(int num1, int num2){
        return  num1+num2;
    }
}
