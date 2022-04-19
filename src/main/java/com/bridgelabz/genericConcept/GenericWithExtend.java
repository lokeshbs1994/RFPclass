package com.bridgelabz.genericConcept;

import com.bridgelabz.classCompare.AddressBook;

public class GenericWithExtend {
    public static void main(String[] args) {
        Mygen<Integer> myGen = new Mygen<>();
        myGen.setName(12345);
//      Integer -> Number -> Object
        /*Object object = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        Object ob = new Integer(0);*/
        Mygen<Abc1> myGen1 = new Mygen<>();
//        myGen1.setName(new Abc1());
//        myGen1.setName(new Abc2());
    }
}

class Mygen<T>{
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

class Abc{
    void m1(){

    }
}

class Abc1 extends  Abc{

}

class Abc2 extends Abc1{

}