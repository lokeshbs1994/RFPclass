package com.bridgelabz.collectionconcept;

import java.util.*;

public class QueueConcept {
    public static void main(String[] args) {
        Queue<DemoComp> queue = new PriorityQueue<>();

        queue.add(new DemoComp(10));
        queue.add(new DemoComp(7));
        queue.add(new DemoComp(1));
        queue.add(new DemoComp(5));
        queue.add(new DemoComp(3));

        System.out.println("Printing the element using for-each loop");
        for (DemoComp d : queue)
            System.out.println(d);

        System.out.println("getting the element from queue ");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class DemoComp implements Comparable<DemoComp> {
    @Override
    public String toString() {
        return "DemoComp{" +
                "value1=" + value1 +
                '}';
    }

    private Integer value1;

    public DemoComp(Integer value1) {
        this.value1 = value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public Integer getValue1() {
        return value1;
    }


    @Override
    public int compareTo(DemoComp o) {
        return o.value1.compareTo(value1);
    }
}