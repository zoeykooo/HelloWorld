package com.hbj.customgeneric;

public class CustomGeneric_ {
    public static void main(String[] args) {
        Tiger<Double,String,Integer> g =new Tiger<>("john");
    }
}
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;
    T[]ts;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }
    //static  R r2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
