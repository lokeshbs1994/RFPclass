package com.bridgelabz.OopsConcept;

public class InheritanceConcept {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.print();
        Child child = new Child();
        child.print();
    }
}

class Parent {
    int i = 10;

    public Parent() {
        System.out.println("Parent constructor");
    }

    public void print() {
        System.out.println("Parent class");
    }

    private void m2() {
        System.out.println("Parent class");
    }

}

class Child extends Parent {
    public Child() {
        System.out.println("Child constructor");
    }

    public void m1() {
        System.out.println("Child class m1");
    }
}