package com.chapter13.arrays_;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName ArrayExercise
 * Description
 * @Author haohao
 * @Date 2022/5/1 15:44
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("新金瓶梅", 90);
        books[2] = new Book("青年文摘20", 5);
        books[3] = new Book("Java 从入门到放弃", 300);

        Arrays.sort(books, new Comparator<Book>() { // 接口编程+匿名内部类+动态绑定
            @Override
            public int compare(Book o1, Book o2) {
                return (int) Math.ceil((o1.getPrice() - o2.getPrice()));
//                return (int) (o2.getPrice() - o1.getPrice());
//                return o2.getName().length()-o1.getName().length(); // 按署名的长度从大到小排序
            }
        });

        for (Book book : books) {
            System.out.println(book.getName() + " " + book.getPrice());
        }

    }

}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
