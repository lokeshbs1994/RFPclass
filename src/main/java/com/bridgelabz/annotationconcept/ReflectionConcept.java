package com.bridgelabz.annotationconcept;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class ReflectionConcept {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        A a = new A();
        a.setD(new Date());
        a.setDb(10.0);
        a.setS("Hello");
        a.setI(95);
        Class<? extends A> aClass = a.getClass(); //getting type of object
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println("declaredFields = " + declaredFields.length);
        for (Field f : declaredFields) {
            f.setAccessible(true);
            //System.out.println("type of [" + f.getName() + "] is {" + f.getType() +"}");
            System.out.println("type of [" + f.getName() + "] is {" + f.getType() + "} and value is = " + f.get(a));
            if (f.getType() == Integer.class) {
                f.set(a, 100);
                System.out.println("Only for integer : type of [" + f.getName() + "] is {" + f.getType() + "} and value is = " + f.get(a));
            }
        }
        System.out.println(a.getI());

        System.out.println("======= specific declared field =========");
        Field i = aClass.getDeclaredField("db");
        System.out.println(i.getName() + " " + i.getType());

        System.out.println("======= All fields =========");
        Field[] fields = aClass.getFields();
        System.out.println(fields.length);
        for (Field f : fields) {
            System.out.println("type of [" + f.getName() + "] is {" + f.getType() + "}");
        }

        System.out.println("======= specific field =========");
        Field i1 = aClass.getField("a");
        System.out.println(i1.getName() + " ::::: " + i1.getType());
        System.out.println();

        System.out.println("======= declared methods =========");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        System.out.println("Count of declared methods : " + declaredMethods.length);
        for (Method f : declaredMethods) {
            System.out.println("type of [" + f.getName() + "] is {" + f.getReturnType() + "}" + " :: count of param :-> " + f.getParameterCount());
// if (f.getName() == "multiply") {
            Class<?>[] parameterTypes = f.getParameterTypes();
            for (Class c : parameterTypes)
                System.out.println("Param info : " + c.getName() + " and type " + c.getTypeName());
// }
        }
    }
}

class B {
    public Integer a;
    public String b;
}
//Object class
class A extends B{

    private Integer i;
    private String s;
    private Date d;
    private Double db;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public Double getDb() {
        return db;
    }

    public void setDb(Double db) {
        this.db = db;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int add() {
        return 0;
    }

    public <T, Q> void multiply(T t, Q q) {

    }
}


@FunctionalInterface
interface MyInt {
    void m1();
}

/**
 * Reflection concept -> we have an object ->
 */