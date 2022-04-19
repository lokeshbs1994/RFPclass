package com.bridgelabz.OopsConcept;

public class InterfaceConcept {
    public static void main(String[] args) {
        MyInterf myInterf = new MyInterfImpl2();
        myInterf.add(2, 3);
        myInterf.multiply(2,3);
    }
}

//concrete class-- abstract class
abstract  class MyInterfImpl implements MyInterf {
    @Override
    public void add(int i, int j) {
        System.out.println(i + j);
    }
}

class MyInterfImpl2 extends MyInterfImpl {
    @Override
    public void multiply (int i, int j) {
        System.out.println(i * j);
    }
}


