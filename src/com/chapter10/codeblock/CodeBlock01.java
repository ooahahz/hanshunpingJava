package com.chapter10.codeblock;


public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        System.out.println("==============================");
        Movie movie1 = new Movie("黄飞鸿", 34, "Doc Huang");

    }
}

class Movie {
    private String name;
    private double price;
    private String director;


    { // 代码块
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    // 3个构造器, 重载
    // (1) 下面的三个构造器都有相同的语句，
    // (2) 防止代码冗余，可以把相同的语句放入到一个代码块中即可
    // (3) 这样我们不管调用哪个构造器，创建对象，都会先调用代码块里面的内容
    // (4) 代码块调用的顺序优先于构造器
    // 理解：相当于另一种形式的构造器（对构造器的补充机制），可以做初始化的操作
    // 场景：如果多个构造器中有重复的语句，可以抽取到初始化代码块中，提高代码的复用性
    public Movie(String name) {
        System.out.println("Movie(String name)构造器被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director)构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
