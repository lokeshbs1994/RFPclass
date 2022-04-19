package com.bridgelabz.recurssionConcept;
// Program to find n-th stair
// using step size 1 or 2 or 3.
import java.lang.*;
import java.util.*;

public class StairCaseProblem {

    // Returns count of ways to reach
    // n-th stair using 1 or 2 or 3 steps.
    public static int findStep(int n)
    {
        if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;

        else
            return findStep(n - 3) + findStep(n - 2)
                    + findStep(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(findStep(n));
    }
}
/**
 * -----4 steps----
 * 1 -> 1 -> 1 -> 1
 * 1 -> 1 -> 2
 * 1 -> 2 -> 1
 * 1 -> 3
 * 2 -> 1 -> 1
 * 2 -> 2
 * 3 -> 1
 *
 * So Total ways: 7
 */
