package com.hspdu.Poly.polyarr_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
        public String say(){
            return super.say()+"score="+score;

    }
    public void study(){
        System.out.println("学生"+getName()+"勉強している");
    }
}
