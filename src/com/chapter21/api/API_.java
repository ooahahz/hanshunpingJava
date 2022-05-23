package com.chapter21.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName API_
 * @Author Oliver
 * @Date 2022/5/23 10:46
 * Description      TODO
 * 演示 INetAddress 类的使用
 * @see InetAddress
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        // 获取本机的 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost); // DESKTOP-CAQ2IMH/192.168.66.1

        // 根据指定的主机名，获取 InetAddress 对象
        InetAddress host1 = InetAddress.getByName("DESKTOP-CAQ2IMH");
        System.out.println("host1 = " + host1);

        // 根据域名返回 InetAddress 对象， 比如 www.baidu.com 对应的 InetAddress 对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2); // www.baidu.com/36.152.44.95

        // 通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2 对应的ip:" + hostAddress);// host2 对应的ip:36.152.44.95

        //通过 InetAddress 对象，获取对应的主机名/或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名：" + hostName);
    }
}
