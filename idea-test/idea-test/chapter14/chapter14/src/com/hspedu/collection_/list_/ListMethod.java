package com.hspedu.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("李白");
        list.add("张三");
        list.add(1,"胡歌");
        System.out.println("list"+list);
        List list2 =new ArrayList();
        list2.add("tom");
        list2.add("jack");
        list.addAll(1,list2);
        System.out.println("list ="+list);
        System.out.println(list.indexOf("tom"));
        list.add("hbj");
        System.out.println("list ="+list);
        list.remove(0);
        System.out.println("list ="+list);
        list.set(1,"okkk");
        System.out.println("list ="+list);
        List returnlist =list.subList(0,2);
        System.out.println("returnlist ="+returnlist);

    }
}
