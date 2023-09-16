package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

    }
}
interface IA{
    void say();
    void hi();
}
class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class Tiger implements IA{}