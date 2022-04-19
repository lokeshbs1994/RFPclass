package com.bridgelabz.inheritance;
// abstract method :
//default and static method ->java 8
// private ->java 9

class Main {
    public static void main(String[] args){
        Vehicle vehicle = new BiCycle();


    }
}
//coupling concept -> loose coupling
public interface InterfaceConcept {
    void print();

    static void m1() {
        System.out.println("InterfaceConcept -> m1 called");
    }

    //only in interface
    default void m2() {
        System.out.println("InterfaceConcept -> m2 called");
    }
}

interface Vehicle {
    int i = 10;
    int noOfWheels();
}

class Car implements Vehicle {
    int i;
    @Override
    public int noOfWheels() {
        return 4;
    }

}

class Bus implements Vehicle {

    @Override
    public int noOfWheels() {
        return 6;
    }
}
class BiCycle implements Vehicle {

    @Override
    public int noOfWheels() {
        return 2;
    }
}