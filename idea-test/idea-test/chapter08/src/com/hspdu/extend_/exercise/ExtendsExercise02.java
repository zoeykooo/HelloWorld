package com.hspdu.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[]args){
        C c= new C();
    }
}
class A{
    public A(){
        System.out.println("==A==");
    }
}

class B extends A{
    public B(){
        System.out.println("==B no other==");
    }public B(String name){
        System.out.println("==B and other==");
    }
}
class C extends B{
    public C(){
        this("hello");
        System.out.println("==C no other==");
    }public C(String name){
        super("hahah");
        System.out.println("==C and other==");
    }
}

