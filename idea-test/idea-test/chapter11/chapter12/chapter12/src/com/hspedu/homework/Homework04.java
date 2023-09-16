package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {//main方法
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }
}
