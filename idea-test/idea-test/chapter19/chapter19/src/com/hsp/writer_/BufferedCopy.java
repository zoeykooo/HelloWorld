package com.hsp.writer_;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        String scrFilePath ="c:\\story.txt";//原文件路径
        String destFilePath ="c:\\story2.txt";//目的文件
        BufferedReader br =null;//
        BufferedWriter bw =null;
        String line;//字符串读取
        try {
            br = new BufferedReader(new FileReader(scrFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while ((line =br.readLine())!=null){
                bw.write(line);
                bw.newLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}
