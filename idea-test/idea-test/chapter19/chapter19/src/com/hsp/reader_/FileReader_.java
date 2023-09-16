package com.hsp.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

        String filePath = "c:\\story.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];


        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}