package com.hspedu.annotation;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}
@Deprecated
class A{
    @Deprecated
    public int n1=10;
    @Deprecated
    public void hi(){

    }
}
