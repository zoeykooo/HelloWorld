package com.hsp.reflection;

import java.lang.reflect.Field;

public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> stuClass = Class.forName("com.hsp.reflection.Student");
        Object o = stuClass.newInstance();
        System.out.println(o.getClass());
        Field age = stuClass.getField("age");
        age.set(o,88);
        System.out.println(o);
        System.out.println(age.get(o));

        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        //name.set(o,"芝麻");
        name.set(null,"芝麻。。");
        System.out.println(o);
        System.out.println(name.get(null));




    }
}

class  Student{
    public int age;
    private static  String name;
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
