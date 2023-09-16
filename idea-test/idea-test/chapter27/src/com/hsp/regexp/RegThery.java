package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegThery {
    public static void main(String[] args) {
        String content="1998Java是一种通用的，基于类的，面向对象的编程语言。 " +
                "它是用于应用程序开发的计算平台。" +
                " 因此，Java是快速，安全和可靠的。 " +
                "它被广泛用于在笔记本电脑，数据中心，游戏机，科学超级计算机，" +
                "手机等中开发Java应用程序。" +
                " Java遵循WORA（Write Once, Run Anywhere。 " +
                "一次写入，到处运行）的原理，并且与平台无关。";

        String regStr ="\\d\\d\\d\\d";
        Pattern pattern=Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("find:"+matcher.group());
        }
    }
}
