package com.chapter19.outputstream_;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName ObjectOutputStream_
 * @Author Oliver
 * @Date 2022/5/19 22:32
 * Description      TODO
 * 演示ObjectOutputStream的使用，完成数据的序列化
 * @see ObjectOutputStream
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        // 序列化后，保存的文件格式不是纯文本，而是按照他的格式来保存
        String filePath = "D:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据到 D:\\data.dat
        // 自动装箱
        oos.writeInt(100); // int -> Integer (实现了 Serializable)
        oos.writeBoolean(true); // boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a'); // char -> Char
        oos.writeDouble(8.3); // double -> Double
        oos.writeUTF("查显昊真棒"); // String 实现了 Serializable

        // 保存一个 Dog 对象
        oos.writeObject(new Dog("小灰", 10, "blue", "被遛", "Japan", new Master("Jack")));
        System.out.println("序列化保存完毕~~");

    }
}

