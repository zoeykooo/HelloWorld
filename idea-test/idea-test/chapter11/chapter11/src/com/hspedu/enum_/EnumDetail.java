package com.hspedu.enum_;

public class EnumDetail {
    public static void main(String[] args) {

    }
    class A{}
    interface IPlaying{
        public void play();
    }
    enum Music implements IPlaying{
        ;

        @Override
        public void play() {
            System.out.println("听音乐");

        }
    }
}
