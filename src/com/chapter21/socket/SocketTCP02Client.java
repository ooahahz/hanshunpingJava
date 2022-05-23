package com.chapter21.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName SocketTCP01Client
 * @Author Oliver
 * @Date 2022/5/23 12:08
 * Description      TODO
 * 客户端，发送 "hello,sever"给服务端
 * @see
 */
@SuppressWarnings("all")
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
//        思路：
//        1. 连接服务器(ip, 端口)
        //   连接本机的 9999 端口，如果连接成功，则返回 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket" + socket.getClass());
//        2. 连接上后，生成 Socket，通过 socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//        3. 通过输出流，写入数据到 数据通道
        outputStream.write("hello,sever".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput(); // 设置结束标记

        // 获取 和 socket 相关的输入流，读取数据（字节）并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen;
        while((readLen = inputStream.read(buf))!= -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        // 4. 关闭流对象和 socket
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");

    }
}
