package com.bridgelabz.classCompare;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressBook addressBook = new AddressBook();
//        System.out.println(addressBook.getName());
        addressBook.setName("Ram");
//        System.out.println(addressBook.getName());

//        System.out.println(addressBook.getMobile());
        addressBook.setMobile("8989898989");
//        System.out.println(addressBook.getMobile());

//        System.out.println(addressBook.getPin());
        addressBook.setPin(696969);
//        System.out.println(addressBook.getPin());

        System.out.println("=====================");
        //
        AddressBook addressBook1=addressBook.clone();
        addressBook1.setMobile("5955959599");

        /*System.out.println(addressBook.getName());
        System.out.println(addressBook1.getName());

        System.out.println("===========================");

        addressBook1.setName("Shyam");
        System.out.println(addressBook.getName());
        System.out.println(addressBook1.getName());

        System.out.println(addressBook);// */
        AddressBook addressBook2= addressBook;

        System.out.println(addressBook);
        System.out.println(addressBook2);
        System.out.println(addressBook1);
        //System.out.println(addressBook.equals(addressBook1));// false
        System.out.println(addressBook.equals(addressBook2));// true -> location
        System.out.println(addressBook.equals(addressBook1));// false

       // addressBook1.setName("Anand");

       // //AddressBook addressBook1=null;
        //System.out.println(addressBook.getClass());

        // 1 person -- multiple address
        HashMap<String , ArrayList<AddressBook>> map = new HashMap<>();
        ArrayList<AddressBook> arrayList = new ArrayList<>();
        arrayList.add(addressBook);
        map.put("Ram", arrayList);

        System.out.println(map);

        if (map.containsKey("Ram")) {
            ArrayList<AddressBook> ram = map.get("Ram");
            ram.add(addressBook1);
            map.put("Ram", ram);
        }
        System.out.println(map);
        //map.entrySet().forEach(v -> System.out.println(v.getKey() + " : " + v.getValue().toString()));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 12, 34, 56, 11, 23));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        ArrayList<AddressBook> books = new ArrayList<>(Arrays.asList(addressBook, addressBook1));

        System.out.println(books);

        Collections.sort(books, Comparator.comparing(AddressBook :: getName));
        System.out.println(books);

        Collections.sort(books, Comparator.comparing(AddressBook :: getName).thenComparing(AddressBook :: getMobile));
        System.out.println(books);
    }
}
