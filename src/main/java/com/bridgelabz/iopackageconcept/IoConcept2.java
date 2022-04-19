package com.bridgelabz.iopackageconcept;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoConcept2 {
    public static void main(String[] args) throws IOException {
        /**
         * FileReader // FileWriter
         * BufferedReader / BufferedWriter
         * PrintWriter
         */
// FileWriter writer = new FileWriter("/home/avinash/Videos/store.txt");
        FileWriter writer = new FileWriter("store1.txt", true);
        System.out.println("Enter the number to check even or not");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
        int i = 10;
        if (i % 2 == 0)
            writer.write("Number is Even");
        else
            writer.write("Number is Odd");
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

        FileReader reader = new FileReader("store1.txt");
// int read = reader.read(); // it will read data from file character by character
// System.out.println((char) read);

        while (reader.ready())
            System.out.print((char) reader.read());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("store1.txt"));
        bufferedWriter.write("Avinash");
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'A', 'V', 'I', 'N', 'A', 'S', 'H'});
        bufferedWriter.flush();
        bufferedWriter.close();


    }
}
