package com.hsp.transformation;

import java.io.*;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        String filePath ="c:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();
        System.out.println("读取到的内容"+s);
        br.close();

    }
}
