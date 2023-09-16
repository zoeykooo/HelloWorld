package com.hspedu.enum_;

public class Enumeration03 {
    public static void main(String[] args) {

    }
}
enum Season03{
    SPRING("春","温暖"), WINTER("冬","寒冷"),SUMMER("夏","热"),AUTUMN("秋","凉爽"),WHAT;
    private String name;
    private String desc;
Season03(){}
    Season03(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}