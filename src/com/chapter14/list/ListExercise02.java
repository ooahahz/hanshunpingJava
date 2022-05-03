package com.chapter14.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @ClassName ListExercise02
 * Description
 * @Author haohao
 * @Date 2022/5/3 12:15
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>();
        List<Object> list = new LinkedList<>();
//        List<Object> list = new Vector<>();
        list.add(new Book("红楼梦", "曹雪芹", 91));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 39));
        list.add(new Book("三国", "罗贯中", 80));
//        list.add(new Book("西游记", "吴承恩", 10));

        // 如何对集合进行排序
        // 冒泡排序
        sort(list);

        // 遍历
        for (Object o : list) {
            System.out.println(o);
        }


    }
    public static void sort(List list) { // 冒泡排序
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                // 取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) { // 交换
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t \t价格" + price + "\t\t作者" + author;
    }
}