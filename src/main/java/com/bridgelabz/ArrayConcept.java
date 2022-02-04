package com.bridgelabz;

import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        //int i=10;
        int[] array=new int[10];
        char array2[]=new char[10];
        double array5[]=new double[10];
        array5[5]=1;
        array2[5]=13;
        System.out.println((int) '^');
        int[] array1={0,1,2,3,4,5,6,7,8,9,}; // 10
        System.out.println(Arrays.toString(array));
//        array[1]=1;
//        System.out.println(Arrays.toString(array));
        for (int k : array1) {
            System.out.println(k);
        }
        System.out.println("for-each loop");
        for (int i : array1) {
            System.out.println(array1[i]);
        }
        int[][] twoD=new int[3][3];
        printArrayValue(twoD);

        //System.out.println(Arrays.deepToString(twoD));
        twoD [0][0]=1;
        twoD [1][1]=1;
        twoD [2][2]=1;
        printArrayValue(twoD);
    }

    private static void printArrayValue(int[][] twoD) {
        System.out.println("print array ......");
        for (int[] i : twoD){
            for (int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
