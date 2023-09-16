package com.hsp.outputstream_;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception{
        String FilePath ="c:\\data.dat";
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(FilePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("haha");
        oos.writeObject(new Dog("黄",10));
        oos.close();
       System.out.println("数据序列化完成");
    }


}
class Dog implements Serializable {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        //private static final long serialVersionUID =1L;
    }

    private String name;
    private int age;
}

