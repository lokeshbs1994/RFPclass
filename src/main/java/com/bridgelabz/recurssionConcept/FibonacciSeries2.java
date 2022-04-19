package com.bridgelabz.recurssionConcept;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        System.out.println("1, 1" + printFibonacci(1, 1, 10));
    }

    private static String printFibonacci(int first, int last, int count) {
        if(count < 3)
            return "";
        return ", " + (first + last) + printFibonacci(last, first + last, count-1);
    }
}
