package com.hsp.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath ="c:\\a\txt";
        InputStreamReader isr =new InputStreamReader(new FileInputStream(filePath),"gbk");
        BufferedReader br =new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("读取到的内容"+s);
        br.close();

    }
}
