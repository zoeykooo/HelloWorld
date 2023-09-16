package com.hspedu.InnerClass;

public class LocalInnerClass {
    public  void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();
    }
    class Outer2{
        private int n1 =100;
        private void m2(){
            System.out.println("Outer02");
        }
        public void m1(){
           final class Inner02{
              public void f1(){
                  System.out.println("n1 ="+n1);
                  m2();
              }
           }
           Inner02 inner02 = new Inner02();
           inner02.f1();
        }

    }
}
