package com.chapter13.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName Date01
 * Description
 * @Author haohao
 * @Date 2022/5/1 20:08
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {

        // 1. 获取当前系统时间
        // 2. 这里的 Date 类是在 java.util.Date 包
        // 3. 默认输出的日期格式是国外的方式，因此通常需要对格式进行转换
        Date d1 = new Date();
        System.out.println("当前日期: " + d1);
        Date d2 = new Date(9234567);
        System.out.println(d1.getTime());
        System.out.println(d2);

        // 1. 创建 SimpleDateFormat 对象，可以指定相应的格式
        // 2. 这里的格式使用的字母是规定好的，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);

        // 1. 可以把一个格式化字符串转化成 Date
        // 2. 得到的 Date 仍然在输出时，还是按照国外的形式，如果希望指定格式输出，需要转换
        // 3. 在把 String -> Date ，使用的 sdf 格式需要和你给的 String 格式一样，否则会抛出转换异常
        String s = "1996年12月26日 10:20:30 星期四";
        Date parse = sdf.parse(s);
        System.out.println(parse);
        System.out.println(sdf.format(parse));
    }
}
