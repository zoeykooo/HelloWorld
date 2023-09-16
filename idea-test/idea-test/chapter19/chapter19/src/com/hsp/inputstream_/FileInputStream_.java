package com.hsp.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath ="c:\\hello.txt";
        int readData =0;
        FileInputStream fileInputStream =null;
        try {
             fileInputStream = new FileInputStream(filePath);
           while(( readData =fileInputStream.read()) !=-1){
               System.out.print((char)readData);
           }
        } catch (IOException e) {
           e.printStackTrace();
        }finally {
        try {
            fileInputStream.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
        }

    }
    public void readFile02(){
        String filePath ="c:\\hello.txt";

        byte []buf =new byte[8];
        int readLen =0;
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while(( fileInputStream.read(buf) ) !=-1){
                System.out.print(new String(buf,0,2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }

    }
}
