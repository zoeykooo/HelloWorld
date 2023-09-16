package com.hspedu.InnerClass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();
        cellphone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
   interface Bell{
        void ring();
    }
        class CellPhone{
            public void alarmClock(Bell bell){
                bell.ring();
            }
        }


