package com.hsp.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    public void create01(){
        String filePath ="e:\\new1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
    public  void create02() {
        File pareFile = new File("e\\");
        String fileName = "news2.txt";
        File file = new File(pareFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public void Create03(){
            String parentPath ="e;\\";
            String fileNAme ="news3.txt";
            File file = new File(parentPath, fileNAme);
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
}
