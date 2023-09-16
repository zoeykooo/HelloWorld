package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() {


        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() throws FileNotFoundException {
        //这里大家思考问题 调用f3() 报错
        //老韩解读
        //1. 因为f3() 方法抛出的是一个编译异常
        //2. 即这时，就要f1() 必须处理这个编译异常
        //3. 在f1() 中，要么 try-catch-finally ,或者继续throws 这个编译异常
        f3(); // 抛出异常
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public static void f4() {

        f5();
    }
    public static void f5() throws ArithmeticException {

    }
}

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {

    @Override
    public void method() throws ArithmeticException {
    }
}

