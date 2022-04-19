package com.bridgelabz.iopackageconcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 */
public class IoConcept {
    public static void main(String[] args) throws IOException {
/**
 * FileReader // FileWriter
 * BufferedReader / BufferedWriter
 * PrintWriter
 */
// FileWriter writer = new FileWriter("/home/avinash/Videos/store.txt");
        FileWriter writer = new FileWriter("store.txt", true);
        System.out.println("Enter the number to check even or not");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
        int i = 10;
        if (i % 2 == 0)
            writer.write("Number is Even");
        else
            writer.write("Number is Odd");
        writer.flush();
        writer.write("\n");

/**
 * String , we can append to file
 */
        writer.write("Number is Even");
        writer.flush();
        writer.write("\n");

/**
 * char[] , we can add
 */
        System.out.println((char) 76);
        writer.write(new char[]{'A', 'B', 'C', 'D', 'E', 'F'});
        writer.write("\n");
        writer.write(new char[]{78, 87, 98, 45, 32, 89});
        writer.write("\n");
        writer.write(98);

        writer.write("\n");
        writer.write("98");
        writer.write("\n");
        writer.write('A');
        writer.write("\n");
        writer.close();

        FileReader reader = new FileReader("store.txt");
// int read = reader.read(); // it will read data from file character by character
// System.out.println((char) read);

        while (reader.ready())
            System.out.print((char) reader.read());


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("store.txt"));
        bufferedWriter.write("Avinash");
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'A', 'V', 'I', 'N', 'A', 'S', 'H'});
        bufferedWriter.flush();


        File file;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("store.txt"));
/**
 * we can read data character by character -> read()
 * => we read line by line -> readLine()
 */
        int count = 0;
/* while (bufferedReader.ready()) {
System.out.print((char) bufferedReader.read());
count++;
}*/
/* while (bufferedReader.ready()) {
System.out.print(bufferedReader.readLine());
count++;
}*/
        System.out.println();
// System.out.println(count);

        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        System.out.println("=====");

        PrintWriter printWriter = new PrintWriter(new FileWriter("store.txt"));
        printWriter.println(12.0);
        printWriter.println(12);
        printWriter.println('A');
        printWriter.println(678L);
        printWriter.println("Hello");
        printWriter.flush();
        printWriter.close();


        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("Enter a name to print");
        bufferedWriter.flush();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String name = reader1.readLine();
        System.out.println(name);

/**
 * we have to print the table 2, 20
 */

        String[] s = reader1.readLine().split(" ");
        for(int j=1; j<=Integer.parseInt(s[1]); j++){
            System.out.println(s[0] + " * " + j + " = " + (Integer.parseInt(s[0]) * j));
        }


        Scanner scanner = new Scanner(new FileReader("store.txt"));
        String string = scanner.nextLine();
        System.out.println(string);

        bufferedWriter.close();

        String[] ss = new Scanner(System.in).nextLine().split(" ");
        for(int j=1; j<=Integer.parseInt(ss[1]); j++){
            System.out.println(ss[0] + " * " + j + " = " + (Integer.parseInt(ss[0]) * j));
        }
    }
}