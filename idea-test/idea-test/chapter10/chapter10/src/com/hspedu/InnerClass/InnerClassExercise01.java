package com.hspedu.InnerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一副名画...");
            }
        });
    }

    public static void f1(IL il){
    il.show();
    }
}
interface IL{
    void show();
}
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("这是俺老孙的画哈哈哈");
    }
}
