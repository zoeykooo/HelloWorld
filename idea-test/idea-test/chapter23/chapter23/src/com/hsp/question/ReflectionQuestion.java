package com.hsp.question;

import com.hsp.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat();
        cat.hi();


        Properties properties = new Properties();
        properties.load(new FileInputStream("scr\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + methodName);

        Class aClass =Class.forName(classfullpath);




    }
}
