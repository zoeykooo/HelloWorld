package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
    A a= new A();
    }
}
class A{
    private int n2 =getN2();
    { System.out.println("A的普通代码被执行");}
    private static int n1=getN1();
    static {
        System.out.println("A的静态代码被执行");
    }
    public static  int getN1(){
        System.out.println("getN1的被执行");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2的被执行");
        return 200;
    }
}
