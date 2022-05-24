package com.chapter21.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName Homework02SenderB
 * @Author Oliver
 * @Date 2022/5/24 10:52
 * Description      TODO
 * 发送端B
 * @see
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        // 1. 创建 DatagramSocket 对象，准备发送和接收数据
        // 准备在 9998 端口上接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        // 2. 将需要发送的数据，封装到 DatagramPacket 对象
        byte[] data = "hello 明天吃火锅~".getBytes(StandardCharsets.UTF_8);

        // 说明：封装的 DatagramPacket对象 data 内容字节数组，data.length，主机(IP)，端口
        DatagramPacket datagramPacket
                = new DatagramPacket(data, data.length, InetAddress.getLocalHost()/*InetAddress.getByName("10.199.69.66")*/, 9999);

        datagramSocket.send(datagramPacket);

        // 接收从 A 端回复的信息
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength(); // 实际接收到的数据字节长度
        byte[] data1 = datagramPacket.getData(); // 接收到的数据

        String string = new String(data1, 0, length);
        System.out.println(string);

        // 3. 关闭资源
        datagramSocket.close();
        System.out.println("B端退出");
    }
}
