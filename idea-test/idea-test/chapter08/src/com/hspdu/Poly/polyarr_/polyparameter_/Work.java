package com.hspdu.Poly.polyarr_.polyparameter_;

public class Work extends Employee{
    public Work(String name, double salary) {
        super(name, salary);
    }
    public void worrk(){
        System.out.println("仕事"+getName()+"woring");
    }
    public double getAnnual(){
        return super.getAnnual();
    }
}
