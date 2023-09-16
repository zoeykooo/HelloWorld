package com.hsp.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> userClass = Class.forName("com.hsp.reflection.User");
        Object o = userClass.newInstance();
        System.out.println(o);
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object hbj = constructor.newInstance("hbj");

        System.out.println("hbj="+hbj);
        Constructor<?> constructor1= userClass.getConstructor(int.class,String.class);
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2"+user2);

    }


}
class User{
    private int age =10 ;
    private String name ="韩顺平教育";
    public User(){

    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "User[age="+age+",name="+name+"]";
    }
}

