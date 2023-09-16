package com.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
abstract class E{
    public abstract void hi();
}
abstract  class F extends E{}
class G extends E{
    public void hi(){ };
}
abstract class H{
    public abstract void hi();
}


abstract class D{
    public int n1=10;
    public static String name="韩顺平教育";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }

}