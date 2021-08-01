package com.Berlin.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author Berlin
 * @Date 2021/1/13 10:51 星期三
 * @Description
 */
public class Receive_ {
    public static void main(String[] args) throws IOException {
        // 创建Socket，指定发送端的端口号
        DatagramSocket socket = new DatagramSocket(6666);

        // 创建集装箱
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

        // 接收数据
        socket.receive(packet);

        // 获取数据
        byte[] arr = packet.getData();

        // 获取有效字节个数
        int len = packet.getLength();
        System.out.println(new String(arr, 0, len));
        socket.close();
    }
}
