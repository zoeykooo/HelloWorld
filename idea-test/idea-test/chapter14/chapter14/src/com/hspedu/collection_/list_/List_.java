package com.hspedu.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hbj");
        list.add("tom");
        System.out.println("list="+list);
        System.out.println(list.get(3));
    }
}
