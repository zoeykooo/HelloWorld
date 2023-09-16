package com.hsp.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath ="c:\\a.txt";
        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream(filePath);

             fileOutputStream.write('H');

             String str ="hello,world.";
             //str.getBytes();

            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
