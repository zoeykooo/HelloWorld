package com.hsp.writer_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args)throws IOException {
        String filePth ="c;\\story.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePth));
        bufferedWriter.write("hello，轻井泽卷王");
        bufferedWriter.write("hello1，轻井泽卷王");




    }
}
