package com.hspedu.annotation;

public class Override {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
         System.out.println("Father fly..");
    }
    public void say(){}
}
class Son extends Father{
    @java.lang.Override
    public void fly() {
      System.out.println("son fly...");
    }

    @java.lang.Override


    public void say(){}
}


