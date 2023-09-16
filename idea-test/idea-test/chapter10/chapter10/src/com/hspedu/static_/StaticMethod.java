package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu n1=new Stu("kate");
        n1.payfee(100.1);
        Stu n2=new Stu("bq");
        n2.payfee(200.1);
        Stu.Showfee();
    }
}

class Stu{

    public String name;
    private static double fee =0;

    public Stu(String name) {
        this.name = name;
    }
    public static void  payfee(double fee){
        Stu.fee +=fee;
    }
    public static void Showfee(){
        System.out.println("总收费为"+Stu.fee);
    }
}
