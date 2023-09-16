package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance =GirlFriend.getInstance();
        System.out.println(instance);

    }
}
class  GirlFriend{
    private String name;
    private static GirlFriend gf =new GirlFriend("hbj");

    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }
}
