package com.chapter21.socket;


import java.io.*;
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
public class SocketTCP03Server {
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
        // 4. IO 读取 ，这里使用了转换流，将 inputStream 这个字节流转换成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String s = bufferedReader.readLine();
        System.out.println(s); // 输出

        // 获取 socket 相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, client 字符流");
        bufferedWriter.newLine(); // 插入一个换行符，表示回复内容的结束
        bufferedWriter.flush(); //　需要手动刷新

//        socket.shutdownOutput(); // 设置结束标记


        // 关闭流和 socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();

    }
}
