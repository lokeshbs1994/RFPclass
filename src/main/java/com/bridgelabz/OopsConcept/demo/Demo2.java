package com.bridgelabz.OopsConcept.demo;

import com.bridgelabz.OopsConcept.Demo;
import com.bridgelabz.OopsConcept.inheritance.Parent;

public class Demo2 {
    public static void main(String[] args) {
       /* Demo demo = new Demo();
        Parent parent = new Parent();
        parent.print();*/
        Demo3 demo3 = new Demo3();
        demo3.m2();
        Demo4 demo4= new Demo4();
        demo4.print();
    }
}

//method -- class --parentclass
class Demo3 extends Parent {
    public int i = 20;

    public void accessI() {
        System.out.println(super.i);
    }

    // this, super
    @Override
    protected void m2() {
        super.m2();
    }
}
class Demo4 extends Demo3 {

}