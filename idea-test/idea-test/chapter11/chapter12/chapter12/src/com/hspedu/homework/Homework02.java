package com.hspedu.homework;

public class Homework02 {
    public static void main(String[] args) {


        if(args[4].equals("john")){
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        Object o= args[2]; //String->Object ，向上转型
        Integer i = (Integer)o; //错误，这里一定会发生 ClassCastException

    }
}

