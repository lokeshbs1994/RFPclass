package com.bridgelabz.recurssionConcept;

public class RecursionExample3 {

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+factorial(5));
    }

    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }
}

/**
 * 5 * fac(4)
 * 4 * fac(3)
 * 3 * fac(2)
 * 2 * fac(1)
 * 1
 */