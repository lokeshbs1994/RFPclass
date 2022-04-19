package com.bridgelabz.collectionconcept;

import java.util.*;

public class PriorityConcept {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 4, 4, 1, 5, 5, 6, 7, 7, 8, 9};
        Set<Integer> set = new HashSet(Arrays.asList(i));
        System.out.println(set);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i1 : i) {
            if (map.containsKey(i1)) {
                Integer integer = map.get(i1);
                integer = integer + 1;
                map.put(i1, integer);
            } else
                map.put(i1, 1);
        }

        System.out.println(map);

        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(new Student(1, "Abc", 'D'));
        students.add(new Student(2, "Abc1", 'C'));
        students.add(new Student(3, "Abc2", 'C'));
        students.add(new Student(4, "Abc3", 'B'));
        students.add(new Student(6, "Abc4", 'A'));
        students.add(new Student(5, "Abc5", 'A'));

        pollTheDataFromQueue(students);
    }

    private static void pollTheDataFromQueue(PriorityQueue<Student> students) {
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
    }
}

/*
grade, if grade is same then consider roll number
 */

class Student implements Comparable<Student> {
    private Integer rollNumber;
    private String name;
    private Character grade;

    public Student(Integer rollNumber, String name, Character grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public Integer getrollNumber() {
        return rollNumber;
    }

    public void setrollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (grade < o.grade)
            return -1;
        else if (grade > o.grade)
            return 1;
        else
            return rollNumberPriority(o);
    }

    private int rollNumberPriority(Student o) {
        if (rollNumber < o.rollNumber)
            return -1;
        else if (rollNumber > o.rollNumber)
            return 1;
        return 0;
    }


}