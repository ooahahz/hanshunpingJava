package com.chapter19.inputstream_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.chapter19.outputstream_.Dog;

/**
 * @ClassName ObjectInputStream_
 * @Author Oliver
 * @Date 2022/5/19 22:50
 * Description      TODO
 * @see
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {

        // 指定反序列化文件
        String filePath = "D:\\data.dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

        // 读取
        // 1. 读取（反序列化）的顺序需要和序列化的顺序一致
        // 2. 否则会报异常
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        Object dog = objectInputStream.readObject();
        System.out.println("运行类型=" + dog.getClass()); // com.chapter19.outputstream_.Dog
        System.out.println(dog); // 底层 Object -> Dog

        // 这里有很重要的细节
        //1. 如果我们希望调用 Dog 方法，需要向下转型
        //2. 需要我们将 Dog 类的定义，拷贝到可以引用的地方，或者导入 Dog
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());

        // 关闭流，关闭外层流即可，底层会自动关闭
        objectInputStream.close();
    }
}
