package com.hspedu.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 =new Monster();
        if01 =new Car();
    }
}
interface IF{}
class Monster implements IF{}
class Car implements IF{}
class AAA{}
class BBB extends AAA{}
class CCC extends AAA{}