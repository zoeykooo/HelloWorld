package com.hspedu.codeblock_;

public class CodeBlock01 {

}
class Movies{
    private String name;
    private double price;
    private String director;
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
    }

    public Movies(String name) {
        this.name = name;
        System.out.println("Movies(String name)被调用");
    }

    public Movies(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movies(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
