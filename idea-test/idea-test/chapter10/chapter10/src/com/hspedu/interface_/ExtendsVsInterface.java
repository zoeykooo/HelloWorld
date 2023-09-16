package com.hspedu.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LitterMonkey bj =new LitterMonkey("悟空");
        bj.climbing();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public  void climbing(){
        System.out.println("猴子会爬树");
    }
}
interface Fishable{
    void swimming();
}
class LitterMonkey extends Monkey implements Fishable{
    @Override
    public void swimming() {
        System.out.println("通过学习像鱼一样游");
    }

    public LitterMonkey(String name){
        super(name);


    }
}

