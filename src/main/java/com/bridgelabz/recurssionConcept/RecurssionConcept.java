package com.bridgelabz.recurssionConcept;

public class RecurssionConcept {
    public static void main(String[] args) {
//        m9();
//        System.out.println("main");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sumTheNumber = sumTheNumber(arr, arr.length);
        System.out.println(sumTheNumber);
        System.out.println("============================");

        int[] arr1 = {31, 72, 13, 4, 55, 96, 7, 8};
        int maxValue = findMax(arr1, arr1.length);
        System.out.println(maxValue + " -> max");

        int minValue = findMin(arr1, arr1.length);
        System.out.println(minValue + " -> min");

        int count = 12;
        System.out.print("Fibonacci series:\n1, 1, ");
        for (int i=3; i <= count; i++) {
            System.out.print(printFibonacci(i) + ", ");
        }
    }

    private static int printFibonacci(int count) {
        if (count < 3 )
            return 1;
        return printFibonacci(count - 1) + printFibonacci(count - 2);
    }

    private static int findMin(int[] arr1, int length) {
        if (length == 1)
            return arr1[0];
        return arr1[length - 1] < findMin(arr1, length - 1) ? arr1[length - 1] : findMin(arr1, length - 1);
    }

    private static int findMax(int[] arr1, int length) {
        if (length == 1)
            return arr1[0];
        return arr1[length - 1] > findMax(arr1, length - 1) ? arr1[length - 1] : findMax(arr1, length - 1);
    }

    private static int sumTheNumber(int[] box, int noOfBalls) {
        if (noOfBalls == 0)
            return 0;
        return box[noOfBalls - 1] + sumTheNumber(box, noOfBalls - 1);
    }

    private static void m9() {
        m10();
        System.out.println("m9");
    }

    private static void m10() {
        m11();
        System.out.println("m10");
    }

    private static void m11() {
        System.out.println("m11");
    }
}
