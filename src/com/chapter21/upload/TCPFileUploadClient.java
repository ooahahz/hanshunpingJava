package com.chapter21.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName TCPFileUploadClient
 * @Author Oliver
 * @Date 2022/5/23 17:01
 * Description      TODO
 * 文件上传的客户端
 * @see
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

        // 客户端连接服务端，得到 Socket
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        // 把磁盘上的图片读到文件字节数组
        // 创建读取磁盘文件的输入流
        String filePath = "D:\\ooah.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

        // 这里 bytes 就是 filePath 对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        // 通过 socket 获取到输出流，将 bytes 数据发送到服务端
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes); // 将文件对应的字节数组写入到数据通道

        bufferedInputStream.close();
        // 设置结束标记
        socket.shutdownOutput();


        // ====接收从服务端回复回来的消息
        InputStream inputStream = socket.getInputStream();
        // 使用 StreamUtils 工具类里面的方法，直接将 InputStream 读取到的内容转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);


        // 关闭相关流
        inputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
