package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01  {
    public static void main(String[] args) {

    }
    public  void  f2() throws FileNotFoundException,NullPointerException{
        FileInputStream fis =new FileInputStream("d://aa.txt");
    }

}
