package com.hspedu.try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str ="hhh";
            int a =Integer.parseInt(str);
            System.out.println("数字"+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息="+e.getMessage());
        } finally {
            System.out.println("finally 代码块被执行...");
        }
        System.out.println("程序继续...");

    }
}
