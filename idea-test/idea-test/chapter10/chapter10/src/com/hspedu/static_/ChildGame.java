package com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args){
        int count =0;
Child child1 =new Child("白骨精");
child1.join();
count++;
Child child2 =new Child("狐狸精");
        child2.join();
        count++;
Child child3 =new Child("猴子精");
        child3.join();
        count++;

        System.out.println("共有"+count+"人加入游戏。。");
    }

}

class Child{
    private String name;

    public Child(String name) {
        this.name = name;
    }
    public  void join(){
        System.out.println(name+"join on....");

    }
}
