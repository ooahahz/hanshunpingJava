package com.hspedu.houserent.utils;

public class TestUtility {
    public static void main(String[] args) {
        // 这是一个测试类，使用完毕就可删除
        String s = Utility.readString(3);
        System.out.println("s = " + s);


        String hspedu = Utility.readString(10, "hspedu");
        System.out.println("s2 = " + hspedu);

        // 有一个疑问
        // 上面直接使用 类.方法() ==> 因为当一个方法是 static 时，就是一个静态方法
        // 注意静态方法可以直接可以通过类名调用
    }
}
