package com.hspedu.Customexception_;

public class CustomException {
    public static void main(String[] args) {
        int age =180;
        if (!(age>=18 && age <=120)){
            throw new AgeException("18~120");

        }
        System.out.println("你的年龄范围正确");
    }
}
    class AgeException extends RuntimeException{
        public AgeException(String message) {
            super(message);
        }
    }

