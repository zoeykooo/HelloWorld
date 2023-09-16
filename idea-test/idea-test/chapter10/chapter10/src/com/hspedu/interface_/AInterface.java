package com.hspedu.interface_;

public interface AInterface {
    public int n1 = 10;

    public void hi();
    default public void ok(){
        System.out.println("ok..");
    }
    public static void cry(){
        System.out.println("cry..");
    }

}
