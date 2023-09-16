package com.hsp.transformation;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath ="c:\\hsp.txt";
        String charSet ="utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi,hsp");
        osw.close();
        System.out.println("按照"+charSet+"保存文件成功");
    }
}
