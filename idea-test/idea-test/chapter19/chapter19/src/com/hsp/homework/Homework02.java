package com.hsp.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) throws IOException {
    String filePath ="c:\\story.txt";
    BufferedReader br =null;
         br = new BufferedReader(new FileReader(filePath));
         String line ="";
         int linNum =0;
         while((line = br.readLine()) !=null){
             System.out.println(++linNum+line);
             if (br !=null){
                 br.close();
             }
         }



    }
}
