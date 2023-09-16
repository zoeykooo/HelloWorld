package com.hsp.transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("c:\\f2.txt"));
        printWriter.write("hi,beijing");
        printWriter.close();
    }
}
