package com.bridgelabz.exceptionConcept;

import java.io.FileReader;
import java.util.Locale;

public class ExceptionConcept {
    public static void main(String[] args) {
        //throw new MyRunTimeException("Exception occurred"); //user defined exception
        compareValue(null, 1);
    }

    public static int compareValue(Integer i, Integer j) {
        // Exception handling
        try {

        } catch (Exception e) {

        }
        System.out.println();
        try {
            /**
             *
             */
            //return i.compareTo(j);
            /*int[] arr = {1,2};
            System.out.println(arr[8]);*/
            FileReader fileReader = new FileReader("abc.txt");
            fileReader.read();
            /*String s = null;
            s.toUpperCase();*/
            //     System.out.println(10/0);
        } catch (NullPointerException ex) {
            throw new MyRunTimeException("401","Null exception input");
        } catch (ArrayIndexOutOfBoundsException ex2) {
            throw new MyRunTimeException("501","Array exception input");
        } catch (ArithmeticException ex) {
            throw new MyRunTimeException("601","Mathematical exception input");
        } catch (Exception e) {
            e.printStackTrace();
            //MyRunTimeException myRunTimeException = new MyRunTimeException("exception");
            throw new MyRunTimeException("701","exception");
        }finally{
            System.out.println("Finally block called");
        }

       //try with resource
        try(FileReader fileReader = new FileReader("abc.txt")){

        }catch (Exception ex){

        }

        return 0;

    }


}

/**
 * Exception
 * a> Runtime: while the execution program
 * b>compile time: while compilationof code
 * .java -> .class ->
 */

// user defined exception

// compile time exception
class MyCompileTimeException extends Exception {
    public MyCompileTimeException(String message) {
        super(message);
    }
}

// run time exception
class MyRunTimeException extends RuntimeException {
    private String MessageCode;
    private String MessageDesc;
    public MyRunTimeException(String MessageCode, String MessageDesc) {
        super(MessageDesc);
        this.MessageCode=MessageCode;
        this.MessageDesc=MessageDesc;
    }
}