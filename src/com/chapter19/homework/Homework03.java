package com.chapter19.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @ClassName Homework03
 * @Author Oliver
 * @Date 2022/5/22 15:47
 * Description      TODO
 * @see
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\dog.properties"));

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println("===dog对象信息===");
        System.out.println(dog);

        // 将创建的 Dog 对象序列化到文件dog.dat 需要用到 ObjectOutputStream
        String filePath = "D:\\dog.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeObject(dog);
        // 关闭流
        objectOutputStream.close();
        System.out.println("====序列化完毕===");
    }

    // 再编写方法，反序列化 dog
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String filePath = "D:\\dog.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        Dog dog = (Dog)objectInputStream.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);

        objectInputStream.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
