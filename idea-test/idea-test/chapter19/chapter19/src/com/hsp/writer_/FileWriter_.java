package com.hsp.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath ="c:\\note.txt";
        FileWriter fileWriter =null;
        char[] chars ={'a','b','c'};
        try {
            fileWriter=new FileWriter(filePath);
            fileWriter.write('H');
            fileWriter.write(chars);
            fileWriter.write("hbj学韩顺平".toCharArray(),0,3);
            fileWriter.write("你好北京");
            fileWriter.write("北韩顺平",0,2);
            fileWriter.write("风雨之后，定见彩虹");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序结束..");
    }
}
