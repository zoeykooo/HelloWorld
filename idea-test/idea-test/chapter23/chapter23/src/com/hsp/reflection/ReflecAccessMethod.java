package com.hsp.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> bossCls = Class.forName("com.hsp.reflection.Boss");
        Object o = bossCls.newInstance();
        Method hi = bossCls.getDeclaredMethod("hi", String.class);
        hi.invoke(o,"hspjy");
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"z" ,"man"));
        System.out.println(say.invoke(null,200,"ss" ,"woman"));

        Object reVal = say.invoke(null, 300, "ww", "man");
        System.out.println("reVal的运行类型="+reVal.getClass());


    }
}
class Boss{
    public  int age;
    private  static  String name;
    public  Boss(){

    }
    private static String say(int n,String s,char c){
        return n +""+""+c;
    }
    public void hi(String s){
        System.out.println("hi"+s);
    }
}
