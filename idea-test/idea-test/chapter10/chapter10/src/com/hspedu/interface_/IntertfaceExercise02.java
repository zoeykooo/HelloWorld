package com.hspedu.interface_;

public class IntertfaceExercise02 {
    public static void main(String[] args) {

    }
    interface A{
        int x=0;
    }
    class B{
        int x =1;
    }
    class C extends B implements A{
        public void px(){
            System.out.println(A.x);
        }
    }
}
