package com.hspdu.smallchange;

import java.util.Scanner;

public class SmallChanageSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        do {
            System.out.println("====零钱通菜单====");
            System.out.println("\t\t\t1.零钱明细");
            System.out.println("\t\t\t2.收益");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.println("chose (1-4)");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println("1.零钱明细");
                    break;
                case "2":
                    System.out.println("2.收益");
                    break;
                case "3":
                    System.out.println("\t\t\t3.消费");
                    break;
                case "4":
                    System.out.println("\t\t\t4.退出");
                    break;
                default:
                    System.out.println("err...");
            }
        }
        while (loop);
        System.out.println("over this pay..");
    }
}
