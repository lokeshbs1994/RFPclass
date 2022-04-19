package com.bridgelabz.lambdaConcept;

import java.util.Arrays;

public class LambdaConcept {
    public static void main(String[] args) {

        //we are using a separate class for implementation
        MyInterf myInterf = new MyInterfImpl();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 1};
        System.out.println(myInterf.findSum(arr, arr.length));

        // we are providing the implementation using a anonymous class
        MyInterf myInterf1 = new MyInterf() {
            @Override
            public int findSum(int[] arr, int size) {
                if (size == 0)
                    return 0;
                return arr[size-1] + findSum(arr, size-1);
            }
        };
        System.out.println(myInterf1.findSum(arr, arr.length));
        /**
         * we can provide implementation using the lambda
         * when the interface is functional interface i.e only 1 method
         */

        // providing implementation using lambda
        MyInterf myInterf2 = (a1, size) -> Arrays.stream(a1).sum();
        System.out.println(myInterf2.findSum(arr, arr.length));
    }
}



interface MyInterf {
    int findSum(int[] arr, int size);
}

class MyInterfImpl implements MyInterf{

    @Override
    public int findSum(int[] arr, int size) {
        if (size == 0)
            return 0;
        return arr[size-1] + findSum(arr, size-1); // recursion
    }
}

