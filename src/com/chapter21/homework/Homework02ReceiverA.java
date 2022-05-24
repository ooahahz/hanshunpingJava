package com.chapter21.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName Homework02ReceiverA
 * @Author Oliver
 * @Date 2022/5/24 10:51
 * Description      TODO
 * UDP 接收端
 * @see
 */
@SuppressWarnings({"all"})
public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个 DatagramSocket 对象，准备在 8888 接收数据
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        // 2. 构建一个 DatagramPacket 准备接收数据
        //    在前面讲解 UDP 协议时，一个数据包最大时 64 k
        byte[] buf = new byte[64 * 1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        // 3. 调用接收方法，将通过网络传输的 DatagramPacket 对象填充到 datagramPacket对象
        //    提示：当有数据包发送到本机的 8888 端口时，就会接收到数据
        //         如果没有数据包发送到本机的8888端口，就会阻塞等待
        System.out.println("接收端A 等待接收数据");
        datagramSocket.receive(datagramPacket);

        // 4. 可以把 datagramPacket 进行拆包，取出数据，并显示
        int length = datagramPacket.getLength(); // 实际接收到的数据字节长度
        byte[] data = datagramPacket.getData(); // 接收到的数据

        String string = new String(data, 0, length);
        System.out.println(string);

        // 回复信息给 B 端
        String answer = "";
        if ("四大名著是哪些？".equals(string)) {
            answer = "四大名著 《红楼梦》《水浒传》《西游记》《红楼梦》";
        } else {
            answer = "what?";
        }

        data = answer.getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket1 = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9998);
        datagramSocket.send(datagramPacket1);
        // 5. 关闭资源
        datagramSocket.close();
        System.out.println("A端退出");
    }
}
