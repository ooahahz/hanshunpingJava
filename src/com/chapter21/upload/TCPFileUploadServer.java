package com.chapter21.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TCPFileUploadServer
 * @Author Oliver
 * @Date 2022/5/23 17:00
 * Description      TODO
 * @see
 */
@SuppressWarnings("all")
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {

        // 1. 服务端在本机监听 8888 端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听");
        // 2. 等待客户端的连接
        Socket socket = serverSocket.accept();

        // 3. 读取客户端发送的数据
        //    通过 socket 得到输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        // 4. 将得到的 bytes 数组写入到指定的路径，就得到一个文件了
        String destFilePath = "src\\haohao.jpg";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();

        // 向客户端回复“收到图片”
        // 通过 socket 获取到输出流（字符）
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush(); // 把内容刷新到数据通道
        socket.shutdownOutput(); // 设置写入结束标记

        // 关闭其他资源
        bufferedWriter.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
