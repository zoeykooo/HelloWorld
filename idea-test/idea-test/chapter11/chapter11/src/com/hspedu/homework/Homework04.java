package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone =new Cellphone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return 0;
            }
        },10,8);
    }
}
interface ICalculate{
    public double work(double n1,double n2);

}

class  Cellphone{
    public void testWork(ICalculate iCalculate,double n1,double n2){
        double result=iCalculate.work(n1, n2);
        System.out.println(result);
    }
}