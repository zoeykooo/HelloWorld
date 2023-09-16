package com.hspdu.Poly.polyarr_;

public class Teacher extends Person{
    private  double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say(){
        return super.say()+"salary="+salary;}
    public void teach(){
        System.out.println("先生"+getName()+"teaching");
    }
}

