package com.bridgelabz.lambdaConcept;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class LambdaFunctionConcept {
    public static void main(String[] args) {

        /**
         * Predicate(I) : functional interface : only one abstract method -> default and static
         *
         */
//        Predicate<String > p = new PredicateImpl<>();
//        p.test("test");

        Predicate<Integer> p = (t) -> t % 2 == 0;
        System.out.println(p.test(10));

        Consumer<Integer> consumer = (s) -> System.out.println(s);
        Function<Integer, Integer> function = (f) -> f * 10;
        /**
         * Stream: having a lot of pre - defined method
         */

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                int v = a.get(i) * 10;
                System.out.println(v);
            }
        }
        // sum += a.get(i);
        // System.out.println(sum);
        System.out.println("===============");
        //a.stream().filter(p)
        a.stream().filter(p).map(function).forEach(consumer);
        System.out.println("=================");
        a.stream().filter((t) -> t % 2 == 0).map((f) -> f * 10).forEach((c) -> System.out.println(c));
        System.out.println("=================");
        List<Integer> collect = a.stream().filter((t) -> t % 2 == 0).map((f) -> f * 10).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 3, 4, 1, 3, 5, 6, 8, 8, 9, 9, 14, -1, 12, 12));
        Set<Integer> collect1 = list.stream().filter((t) -> t % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect1);

        int[] arr = {1, 2, 3, 1, 3, 4, 1, 3, 5, 6, 8, 8, 9, 9, 14, -1, 12, 12};

        Arrays.stream(arr).filter((t) -> t % 2 == 0).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toSet());
        System.out.println("Before remove: " + list);
        list.removeIf(t -> t % 2 == 0);
        System.out.println("after remove: " + list);

        int sum1 = IntStream.of(1, 2, 3, 1, 3, 4, 1, 3, 5, 6, 8, 8, 9, 9, 14, -1, 12, 12).sum();
        System.out.println("sum1 = " + sum1);
        OptionalDouble average = IntStream.of(1, 2, 3, 1, 3, 4, 1, 3, 5, 6, 8, 8, 9, 9, 14, -1, 12, 12).average();
        System.out.println("average: " + average.getAsDouble());
        OptionalInt max = IntStream.of(1, 2, 3, 1, 3, 4, 1, 3, 5, 6, 8, 8, 9, 9, 14, -1, 12, 12).max();
        System.out.println("Max: " + max.getAsInt());
        OptionalInt min = IntStream.of(1, 2, 3, 1, 3, 4, 1, 3, 5, 6, 8, 8, 9, 9, 14, -1, 12, 12).min();
        System.out.println("Min: " + min.getAsInt());
        boolean b = IntStream.of(2, 4, 6, 8, 9, 10, 12, 14, 16).peek(t -> System.out.print("\t " + t)).anyMatch(t -> t % 2 != 0);
        System.out.println("\nb = " + b);

        boolean b1 = IntStream.of(2, 4, 6, 8, 10, 12, 14, 16).peek(t -> System.out.print("\t " + t)).allMatch(t -> t % 2 == 0);
        System.out.println("\nb = " + b1);

        boolean b2 = IntStream.of(2, 4, 6, 8, 10, 12, 14, 16).peek(t -> System.out.print("\t " + t)).noneMatch(t -> t % 2 != 0);
        System.out.println("\nb = " + b2);

        //        IntStream.range(10,100).filter(t -> t%2 !=0).map(f -> f*10).forEach(System.out::println); //10 to 99
//        //System.out.println(sum2);
//        DoubleStream.of(10.0, 100.0, 89, 9.08888).forEach(System.out::println);/// cont apply range to double- rational prob
        System.out.println("\n=========================");

        List<List<List<List<Integer>>>> listArrayList4 = new ArrayList<>();
        List<List<List<Integer>>> listArrayList = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        lists.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        lists.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        listArrayList.add(lists);
        listArrayList.add(lists); // 78 + 78 = 156
        listArrayList4.add(listArrayList);
        listArrayList4.add(listArrayList); // 156 + 156 = 312
// listArrayList.add(lists);
// 1, 2, 3, 4, 5, 6, 7, 8,9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8,9, 10, 11, 12
        System.out.println(lists);

        sum = 0;
        for (List<Integer> integerList : lists) {
            for (Integer i : integerList) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(IntStream.range(1, 13).sum());
        Optional<Integer> reduce = lists.stream().flatMap(Collection::stream).reduce(Integer::sum);
        Integer reduce1 = listArrayList.stream().flatMap(Collection::stream).flatMap(Collection::stream).reduce(0, (t, q) -> t + q);
        System.out.println(reduce.get());
        System.out.println(reduce1);
        Integer reduce2 = listArrayList4.stream().flatMap(Collection::stream).flatMap(Collection::stream).flatMap(Collection::stream).reduce(0, (t, q) -> t + q);
        System.out.println(reduce2);

        List<Integer> collecter2 = lists.stream().flatMap(Collection::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> collecter3 = lists.stream().flatMap(Collection::stream).sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        /**
         * List + List // NP
         * List -> List -> List
         * List -> List
         * List
         * Integer
         */
        List<Abc> abcs = new ArrayList<>();
        abcs.add(new Abc(19));
        abcs.add(new Abc(1));
        abcs.add(new Abc(4));
        abcs.add(new Abc(13));
        abcs.add(new Abc(2));
        System.out.println(abcs);
        Collections.sort(abcs, Comparator.comparing(Abc::getId));
        System.out.println(abcs);
        //List<Abc> collecter4 = abcs.stream().filter(v -> v.getId()%2==0).sorted(Comparator.comparing(Abc::getId)).collect(Collectors.toList());
        List<Abc> collecter4 = abcs.stream().filter(v -> v.getId() % 2 == 0).sorted((x, q) -> x.getId() - q.getId()).collect(Collectors.toList());
        System.out.println(collecter4);
    }
}

class Abc {
    private Integer id;

    public Abc(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Abc{" +
                "id=" + id +
                '}';
    }
}

/*class PredicateImpl<T> implements Predicate<T> {
    @Override
    public boolean test(Object o) {
        return false;
    }*/
