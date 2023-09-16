package com.hsp.inputstream_;

import jdk.internal.icu.impl.UBiDiProps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class objectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath ="c:\\data.dat";
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println( ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog =ois.readObject();

        System.out.println("运行类型="+dog.getClass());
        System.out.println("dog信息="+dog);
        ois.close();

    }
}
