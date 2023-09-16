package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add("jack");
        list.add(10);
        list.add(true);
        list.remove(0);
        System.out.println("list="+list);
        list.remove(true);
        System.out.println("list="+list);
        System.out.println(list.contains("jack~"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println("list="+list);
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list"+list);
        System.out.println(list.contains(list2));
        list.add("聊斋");
        list.removeAll(list2);





    }

    }

