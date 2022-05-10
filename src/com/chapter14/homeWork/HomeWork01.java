package com.chapter14.homeWork;

import java.util.ArrayList;

/**
 * @ClassName HomeWork01
 * @Author Oliver
 * @Date 2022/5/9 15:26
 * Description      TODO
 * @see
 */
public class HomeWork01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList<News> news = new ArrayList<>();
        news.add(news1);
        news.add(news2);

        System.out.println(news);
        // 倒序遍历
        for (int i = news.size()-1; i >= 0; i--) {
            News n = news.get(i);
//            if (n.getName().length() > 15) { // 将循环里面的方法封装为 processTitle
//                String newString = n.getName().substring(0, 15) + "...";
//                System.out.println(newString);
//            } else {
//                System.out.println(n.getName());
//            }
            System.out.println(processTitle(n.getName()));
        }

    }
    // 专门写一个静态方法，处理新闻标题
    public static String processTitle(String name) {
        if (name == null) {
            return "";
        }

        if (name.length() > 15) {
            return name.substring(0, 15) + "...";
        } else {
            return name;
        }
    }
}

class News {
    private String name;
    private String content;

    public News(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
