package com.chapter21.socket;

import java.io.*;
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
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
//        思路：
//        1. 连接服务器(ip, 端口)
        //   连接本机的 9999 端口，如果连接成功，则返回 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket" + socket.getClass());
//        2. 连接上后，生成 Socket，通过 socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//        3. 通过输出流，写入数据到 数据通道，要求使用字符流
//        outputStream.write("hello,sever".getBytes(StandardCharsets.UTF_8));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, sever 字符流");
        bufferedWriter.newLine(); // 插入一个换行符，表示写入内容结束(注意：要求对方使用 readLine() 读！！！对方读到 newLine 就结束)
        bufferedWriter.flush(); // 如果使用字符流，需要手动刷新，否则数据不会写入数据通道

//        socket.shutdownOutput(); // 设置结束标记

        // 获取 和 socket 相关的输入流，读取数据（字符）并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        // 4. 关闭流对象和 socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");

    }
}
