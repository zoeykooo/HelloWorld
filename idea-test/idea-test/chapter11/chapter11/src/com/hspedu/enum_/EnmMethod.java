package com.hspedu.enum_;

public class EnmMethod {
    public static void main(String[] args) {
        Season03 autum =Season03.AUTUMN;
        System.out.println(autum.name());
        System.out.println(autum.ordinal());
        Season03[] values=Season03.values();
        for (Season03 season:values){
            System.out.println(season);
        }

       Season03 autumn1= Season03.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);

        System.out.println(Season03.AUTUMN.compareTo(Season03.SPRING));
    }
}
