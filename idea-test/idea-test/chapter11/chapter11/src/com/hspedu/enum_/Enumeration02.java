package com.hspedu.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
    }
}
class  Season02{
    private String name;
    private  String desc;
    public static final Season02 SPRING= new Season02("春","温暖");
    public static final Season02 WINTER= new Season02("冬","寒冷");
    public static final Season02 SUMMER= new Season02("夏","炎热");
    public static final Season02 AUTUMN= new Season02("秋","凉爽");

private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
        }

public String getName() {
        return name;
        }



public String getDesc() {
        return desc;
        }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

