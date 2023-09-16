package com.hspedu.InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

    }
}
class Outer04{


    private int n1 = 10;//属性
    public void method(){
        IA tiger = new IA(){
        @Override
        public void cry() {
            System.out.println("tiger wow");
        }
    };
        System.out.println("tiger运行类型="+tiger.getClass());
        tiger.cry();
        Father father=new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father运行类型="+father.getClass());
        father.test();
        Animal animal =new Animal() {
            @Override
            void eat() {
                System.out.println("dog eat ");
            }
        };
        animal.eat();
    }
}
 interface IA{
    public void cry();
}

class Father {
    public Father(String name){}
    public void test(){}
}
abstract class Animal{
    abstract void eat();
}