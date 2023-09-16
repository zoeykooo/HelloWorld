package com.hspedu.enum_;

public record EnumExercise02() {
    public static void main(String[] args) {
    Week [] weeks =Week.values();
    for (Week week:weeks){
        System.out.println("======");
        System.out.println(week);
    }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
