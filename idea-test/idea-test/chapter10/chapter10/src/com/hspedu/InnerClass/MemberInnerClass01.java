package com.hspedu.InnerClass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08=new  Outer08() ;
        outer08.t1();
    }
}
class Outer08{
    private  int n1 =10;
    public String name ="张三";

    public class Innter08{
        public void say(){
            System.out.println("Outer08 的 n1="+n1+"name ="+name);
        }
    }
    public void t1(){
        Innter08 innter08 =new Innter08();
        innter08.say();
    }
}