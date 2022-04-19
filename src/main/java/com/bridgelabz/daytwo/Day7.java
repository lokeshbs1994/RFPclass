package com.bridgelabz.daytwo;

import com.bridgelabz.OopsConcept.Demo;

/**
 *
 */
public class Day7 {
    /**
     * <h1>demo</h1>
     *
     * @param args
     * @return
     */
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1(1);
        Day7 series = new Day7();
        series.hashCode();
       /* long first =System.currentTimeMillis();
        System.out.println(first);
        for (int i=0;i<1000; i++){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run(){
                    System.out.println("Thread");
                }
            });
            thread.start();
        }*/
//        BigInteger bigInteger = BigInteger.valueOf(2);
//        for (long i = 0; i < 10000l; i++) {
//            bigInteger= bigInteger.multiply(BigInteger.valueOf(2));
//        }
//        System.out.println(bigInteger);
//        System.out.println(bigInteger.toString().length());
//
//        long l = (long) Math.pow(2, 10000000000000000l);
//        System.out.println(l);
        //long last =System.currentTimeMillis();
       /* System.out.println(last);
        System.out.println((last-first)/1000f);*/
    }

    /**
     * <h1>Override hash method</h1>
     * <h4 style=color:red>we declared those method to get hash code a number</h4>
     * @return
     */
//    @Override
//    public int hashcode(){
//        return 0;
//    }

    @Override
    public int hashCode() {
        return 0;
    }
}
