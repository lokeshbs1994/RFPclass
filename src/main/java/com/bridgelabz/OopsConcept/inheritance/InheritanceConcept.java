package com.bridgelabz.OopsConcept.inheritance;

public class InheritanceConcept {
    public static void main(String[] args) {
        Parent parent = new Child();//child -- own +parent
        parent.print();
        Child child = new Child();
        child.print();
    }
}


class Child extends Parent {
    public Child(){
        System.out.println("Child constructor");
    }
    public void m1(){
        System.out.println("Child Class m1");
    }
}