package com.hsp.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","tom");
        properties.setProperty("pwd","abc111");
        properties.store(new FileOutputStream("scr\\mysql2.properties"),"hello,world");
        System.out.println("保存配置文件成功。");
    }
}
