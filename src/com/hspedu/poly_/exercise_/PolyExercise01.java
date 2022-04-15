package com.hspedu.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4; // 可以
        long l = (long)d; // 可以，向下转型
        System.out.println(l);
        int in = 5; // ok
//        boolean b = (boolean)in; // 不可以
        Object obj = "Hello"; // ok，向上转型，左边编译类型是 Object 类，右边运行类型是 String 类
        String objStr = (String)obj; // ok, 向下转型
        System.out.println(objStr);

        Object objPri = new Integer(5); // ok,向上转型
        String str = (String)objPri; // no
        Integer Str1 = (Integer)objPri; // ok, 向下转型
    }

}
