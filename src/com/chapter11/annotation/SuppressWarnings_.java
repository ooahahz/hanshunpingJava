package com.chapter11.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ooah
 * @version 1.0
 */
public class SuppressWarnings_ {

    // 1. 当我们不惜哇嘎看到这些警告的时候，我们可以使用 SuppressWarnings 注解来抑制警告信息
    // 2. 在{""}中，可以写入你希望抑制（不显示）警告信息
    // 3. 关于SuppressWarnings 作用范围是和你放置的位置相关
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));

    }
}
