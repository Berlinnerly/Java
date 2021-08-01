package com.Berlin.socket;

import java.io.IOException;
import java.net.*;

/**
 * @Author Berlin
 * @Date 2021/1/13 10:40 星期三
 * @Description
 */
public class Send {
    public static void main(String[] args) throws IOException {
        // 1. 创建DatagramSocket，随机端口号(码头)
        DatagramSocket socket = new DatagramSocket();

        String str = "aaaaaaaa";
        // 2. 创建DatagramPacket,指定数据，长度，地址，端口（集装箱）
        DatagramPacket packet;
        packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);

        // 发货
        socket.send(packet);

        // 关闭码头
        socket.close();
    }
}
