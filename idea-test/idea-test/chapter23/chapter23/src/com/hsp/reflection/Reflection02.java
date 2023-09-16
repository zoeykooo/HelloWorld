package com.hsp.reflection;

import com.hsp.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) {
        m1();


    }
    public  static void m1(){
        long start = System.currentTimeMillis();
        Cat cat  = new Cat();
        for (int i=0; i<90000000;i++){
        cat.hi();
        }
        long end =System.currentTimeMillis();
        System.out.println("传统方法来调用hi 耗时="+(end-start));
    }
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hsp.cat");
        Object o =cls.newInstance();
        Method hi = cls.getMethod("hi");

        long start = System.currentTimeMillis();
        Cat cat  = new Cat();
        for (int i=0; i<90000000;i++){
            hi.invoke(o);
        }
        long end =System.currentTimeMillis();
        System.out.println("反射m2来调用hi 耗时="+(end-start));
    }
    public static void m3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hsp.cat");
        Object o =cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);

        long start = System.currentTimeMillis();
        Cat cat  = new Cat();
        for (int i=0; i<90000000;i++){
            hi.invoke(o);
        }
        long end =System.currentTimeMillis();
        System.out.println("反射m3来调用hi 耗时="+(end-start));
    }
}
