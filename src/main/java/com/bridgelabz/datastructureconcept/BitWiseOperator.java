package com.bridgelabz.datastructureconcept;

public class BitWiseOperator {
    public static void main(String[] args) {
        /**
         * AND gate -> &&
         * 1 1 = 1
         * 0 1 = 0
         * 1 0 = 0
         * 0 0 = 0
         *
         * OR gate -> ||   XOR gate -> ^
         * 1 1 = 1          1 1 = 0
         * 1 0 = 1          0 0 = 0
         * 0 1 = 1          1 0 = 1
         * 0 0 = 0          0 1 = 1
         *
         */

        int[] i = {1, 2, 3, 4, 5, 3, 2, 5, 1};
        int num = 0;
        for (int i1 : i)
            num = num ^ i1;
        System.out.println(num); // 4

        int[] arr = {4, 6, 7, 8, 9, 1, 2, 3}; // output - 5
        int num1 = 0;
        for (int i1 : arr)
            num1 = num1 ^ i1;
        System.out.println(num1);
        for (int j = 1; j < 10; j++) {
            num1 = num1 ^ j;
        }
        System.out.println(num1);
        /**
         * Left Shift Operator -> <<
         */
        int q = 7;
        System.out.println(q << 1);
        System.out.println(q << 2);
        System.out.println(q << 3);
        System.out.println(7 * Math.pow(2, 10));
        /**
         * right shift operator
         * 6 5 4 3 2 1
         *       1 1 1 -> 7 = > 7 / 1 = 7 / 2^0
         *       0 1 1 -> 3 = > 7 / 2^1
         *       0 0 1 -> 1 => 7 / 2 ^ 2
         */
        int q1 = 109;
        System.out.println(Integer.toBinaryString(q1));
        System.out.println(Integer.parseInt("110110", 2));
        System.out.println(q1 >> 1);
        System.out.println(q1 >> 2);
        System.out.println(q1 >> 3);
        System.out.println(q1 >> 4);
        System.out.println(q1 >> 5);
        System.out.println((int)(109 / Math.pow(2,5)));
        System.out.println("====================");

        int b = 561;
        if((b & 1) == 0)
            System.out.println("even number");
        else
            System.out.println("Odd number");

    }
}
