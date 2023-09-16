package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
    public static void main(String[] args) {

        String content = "a11c8abc _ABCy @";

        String regStr = ".";


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}

