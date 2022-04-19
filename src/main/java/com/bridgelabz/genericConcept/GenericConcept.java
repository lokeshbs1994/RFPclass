package com.bridgelabz.genericConcept;

import java.util.ArrayList;

public class GenericConcept {
    public static void main(String[] args) {
        MyGen<String > gen = new MyGen();
//        gen.setName(123345);
//        gen.setName(123345.0);
        gen.setName("1233213");
        gen.setMobile("1239288474");

        MyGen<Integer> gen2 = new MyGen();
        gen2.setName(123345);
//        gen2.setMobile(7438478);
        Integer integer1 = gen2.getName();

        MyGen gen3 = new MyGen();
//        gen3.setName(123345);
//        Integer integer = (Integer) gen3.getName();
        gen3.setName("123345");
        String integer = (String) gen3.getName();

        ArrayList<Integer> arrayList = new ArrayList<>();
    }
}

class MyGen<T> {
    private T name;
    private T lastName;
    private String mobile;

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}