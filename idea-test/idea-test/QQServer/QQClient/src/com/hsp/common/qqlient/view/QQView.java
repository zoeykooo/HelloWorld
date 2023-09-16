package com.hsp.common.qqlient.view;

import com.hsp.utils.Utility;

public class QQView {
    private boolean loop =true;
    private  String key ="";

    public static void main(String[] args) {
        new QQView().mainMenu();
    }

    private  void mainMenu(){

        while (loop){
            System.out.println("=======欢迎登录网络通信系统======");
            System.out.println("\t\t 1 登录系统 ");
            System.out.println("\t\t 9 退出系统 ");
            System.out.println("请输入你的选择 ");


            key = Utility.readString(1);

            switch (key){
                case "1":
                    System.out.println("请输入用户号");
                    String userID =Utility.readString(50);

                    System.out.println("请输入密 码");
                    String pwd =Utility.readString(50);



                    if (true){
                        System.out.println("========欢迎"+ userID +"============");

                        while (loop){
                            System.out.println("=======欢迎登录网络通信二级菜单(用户"+ userID +")======");
                            System.out.println("\t\t 1 显示在线用户列表 ");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择 ");
                            key =Utility.readString(1);
                            switch(key){
                                case "1":
                                    System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "３":
                                    System.out.println("私聊消息");
                                    break;
                                case "４":
                                    System.out.println("发送文件");
                                    break;
                                case "９":
                                    loop = false;
                                    break;
                            }
                        }
                    }else {
                        System.out.println("===登录失败===");
                    }
                    break;
                case "9":


                    loop = false;
                    break;


            }
        }

    }
}
