package com.bridgelabz.inheritance;

public class AbstractClassConcept {
    public static void main(String[] args) {
    }
}

//interface+class
abstract class Payment {
    int i;

    abstract boolean verify();

    public void print() {
        System.out.println("Payment --> print method");
    }

    private void print2() {
        System.out.println("Payment --> print method");
    }

    protected void print3() {
        System.out.println("Payment --> print method");
    }

    void print4() {
        System.out.println("Payment --> print method");
    }

    static void print5() {
        System.out.println("Payment --> print method");
    }
}

class UpiPayment extends Payment {

    @Override
    boolean verify() {
        return true;
    }
}