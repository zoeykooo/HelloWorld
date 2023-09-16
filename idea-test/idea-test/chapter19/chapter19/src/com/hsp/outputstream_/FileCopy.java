package com.hsp.outputstream_;

import com.hsp.inputstream_.FileInputStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String scrFilePath ="e:\\kaola.jpg";
        String destFilePath ="c:\\kaola.jpg";
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream =null;
        try {
            fileInputStream =new FileInputStream(scrFilePath);
            fileOutputStream =new FileOutputStream(destFilePath);
            byte[] buff =new byte[1024];
            int readLen =0;
            while((readLen =fileInputStream.read(buff))!= -1){
                fileOutputStream.write(buff,0,readLen);
            }
            System.out.println("okk");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

                try {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch(IOException e){
                        throw new RuntimeException(e);
                    }



        }

    }
}
