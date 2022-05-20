package com.chapter19.imitate_;

/**
 * @ClassName BufferReader_
 * @Author Oliver
 * @Date 2022/5/18 14:01
 * Description      TODO
 * 做成处理流（包装流）
 * @see
 */
public class BufferReader_ extends Reader_ {
    private Reader_ reader_; // 属性是 Reader_

    // 接收 Reader_子类对象
    public BufferReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void read() {
        reader_.read();
    }


    // 让方法更加灵活，多次读取文件 [扩展了方法]
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.read();
        }

    }

    // 扩展 readString 方法，批量处理字符串数据
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.read();
        }
    }

}
