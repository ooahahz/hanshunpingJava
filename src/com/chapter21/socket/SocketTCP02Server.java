package com.chapter21.socket;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName SocketTCP01Server
 * @Author Oliver
 * @Date 2022/5/23 11:59
 * Description      TODO
 * @see
 */
@SuppressWarnings("all")
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {

//         * 思路
//         * 1. 在本机的 9999 端口监听，等待连接
//            要求在本机没有其他服务在监听 9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
//         * 2. 当没有客户端连接 9999 端口时，程序会阻塞，等待连接
//                当有客户端连接，则会返回 Socket 对象，程序继续
        Socket socket = serverSocket.accept();

        System.out.println("服务端 socket" + socket.getClass());
//         * 3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();
        // 4. IO 读取
        byte[] buf = new byte[1024];
        int readLen;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        // 获取 socket 相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput(); // 设置结束标记



        // 关闭流和 socket
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();

    }
}
