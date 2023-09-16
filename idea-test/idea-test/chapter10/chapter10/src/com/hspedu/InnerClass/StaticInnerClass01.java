package com.hspedu.InnerClass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 =new Outer10();
        outer10.m1();
        Outer10.Inner10 inner10=new Outer10.Inner10();
        inner10.say();
        Outer10.Inner10 inner101 = outer10.getInner10();
        System.out.println("==========");
        inner101.say();
        Outer10.Inner10 inner10_ =Outer10.getInner10_();

    }
}
class Outer10{
    private int n1 =10;
    private static String name ="张三";
    static class Inner10{
        private static String name ="韩顺平教育";
        public void say(){
            System.out.println(name+"外部类name="+Outer10.name);

        }
        }
        public  void m1(){
        Inner10 inner10=new Inner10();
        inner10.say();
        }
        public Inner10 getInner10(){
        return new Inner10();
        }
        public static Inner10 getInner10_(){
        return new Inner10();

        }
    }

