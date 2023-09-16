package com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
       Season spring= new Season("春","温暖");
        Season winter= new Season("冬","寒冷");
        Season summer= new Season("夏","炎热");
        Season autumn= new Season("秋","凉爽");
        Season other = new Season("红天","~~");
    }
}
class Season{
    private String name;
    private  String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
