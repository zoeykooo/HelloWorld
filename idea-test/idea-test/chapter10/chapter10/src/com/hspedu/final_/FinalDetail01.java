package com.hspedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {

    }
}
class AA{
    public  final double TAX_RATE=0.08;
    public  final double TAX_RATE2;
    public  final double TAX_RATE3;

    public AA( ) {
       TAX_RATE2 = 1.1;}
        {TAX_RATE3 = 8.8;}
    }
class BB{
    public static final double TAX_RATE=99.9;
    public static final double TAX_RATE2;
   static  {TAX_RATE2 =22;}
}
final class CC{}
class DD{
    public final void cal(){
        System.out.println("cal()");
    }
}
class EE extends DD{

}
