package com.hspedu.string_;

public class StringMethod01 {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 ="Hello";
        System.out.println(str1.equals(str2));
        String username ="johN";
        if("john".equalsIgnoreCase(username)){
            System.out.println("Success!");
        }else{
            System.out.println("Failure!");
        }
        System.out.println("hbj".length());
        String s1 = "wer@terwe@g";
        int index = s1.indexOf('@');
        System.out.println(index);// 3
        System.out.println("weIndex=" + s1.indexOf("we"));
        s1 = "wer@terwe@g@";
        index = s1.lastIndexOf('@');
        System.out.println(index);//11
        System.out.println("ter的位置=" + s1.lastIndexOf("ter"));//4

        String name = "hello,张三";

        System.out.println(name.substring(6));

        System.out.println(name.substring(2,5));//llo

    }

}
