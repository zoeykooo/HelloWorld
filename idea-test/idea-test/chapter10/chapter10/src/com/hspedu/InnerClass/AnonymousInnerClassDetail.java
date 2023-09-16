package com.hspedu.InnerClass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05=new Outer05();
        outer05.f1();
        System.out.println("main outer05 hashcode ="+outer05);
    }
}
class Outer05{
    private int n1=99;

    public void f1(){
        Person hbj=new  Person(){
            private int n1 = 88;

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()"+n1+"外部内的n1"+Outer05.this.n1);
                System.out.println("  Outer05.this hashcode"+Outer05.this);
            }
        };
        hbj.hi();
        new  Person(){
            @Override
            public void ok(String str) {
                super.ok(str);
            }

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()..haha");
            }

        }.ok("jack");
    }
}
class Person{
    public void hi(){
        System.out.println("Person hi()");

    }
    public void ok(String str){
        System.out.println("person ok()"+str);
    }
}
