package com.chapter15.customGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericExtends
 * @Author Oliver
 * @Date 2022/5/11 20:02
 * Description      TODO
 * 1. 泛型不具备继承性
 * 2. <?> : 支持任意泛型类型
 * 3. <? extends A> : 支持A类以及A类的子类，规定了泛型的上限
 * 4. <? super A> :   支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
 * @see
 */
public class GenericExtends_ {
    public static void main(String[] args) {

//        Object string = new String();

        // 泛型没有继承性
//        List<Object> list = new ArrayList<String>();

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();

        // 如果是 List<?> c ，可以接受任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);


        // ? extends AAA 表示上限，可以接受AAA或AAA子类
//        printCollection2(list1); // 不行
//        printCollection2(list2); // 不行
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);



//      <?super A > :支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
        printCollection3(list1);
//        printCollection3(list2);
        printCollection3(list3);
//        printCollection3(list4);
//        printCollection3(list5);

    }

    public static void printCollection1(List<?> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    public static void printCollection2(List<? extends AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    public static void printCollection3(List<? super AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

}

class AAA {

}

class BBB extends AAA {

}

class CCC extends BBB {

}
