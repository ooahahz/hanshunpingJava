package com.chapter21.socket;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName SocketTCP01Server
 * @Author Oliver
 * @Date 2022/5/23 11:59
 * Description      TODO
 * @see
 */
public class SocketTCP01Server {
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
        // 关闭流和 socket
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
