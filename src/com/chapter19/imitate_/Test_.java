package com.chapter19.imitate_;


/**
 * @ClassName Test_
 * @Author Oliver
 * @Date 2022/5/18 14:05
 * Description      TODO
 * @see
 */
public class Test_ {
    public static void main(String[] args) {

        BufferReader_ bufferReader_ = new BufferReader_(new FileReader_());
        bufferReader_.readFiles(5);
        bufferReader_.read();

        // 希望通过 BufferReader_ 多次读取字符串
        BufferReader_ bufferReader_2 = new BufferReader_(new StringReader_());
        bufferReader_2.readStrings(5);
        bufferReader_2.read();
    }
}
