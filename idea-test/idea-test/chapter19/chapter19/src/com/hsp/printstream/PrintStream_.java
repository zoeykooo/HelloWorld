package com.hsp.printstream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out =System.out;
        out.print("john,hello");
        out.write("hsp,hello".getBytes());


        out.close();
        System.setOut(new PrintStream("c:\\f1.txt"));
    }
}
