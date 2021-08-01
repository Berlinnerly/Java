package com.Berlin.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author Berlin
 * @Time 2020/11/10 10:56
 */
public class MoreThread_ {
    public static void main(String[] args) throws IOException {
        new Receive().start();

        new Send().start();
    }
}

class Receive extends Thread {
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket(6666);       //创建socket
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

            while (true) {
                socket.receive(packet);             //接货，接收数据
                byte[] arr = packet.getData();              //获取数据
                int len = packet.getLength();                //获取有效的字节个数
                String ip = packet.getAddress().getHostAddress();           //获取IP地址
                int port = packet.getPort();                //获取端口号
                System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Send extends Thread {
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            DatagramSocket socket = new DatagramSocket();       //创建Socket相当于创建码头

            while (true) {
                String line = sc.nextLine();                //获取键盘录入的对象
                if ("quit".equals(line)) {
                    break;
                }
                DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length,
                        InetAddress.getByName("127.0.0.1"), 6666);  //创建packet，相当于创建集装箱
                socket.send(packet);                                        //发货，将数据发出去
            }

            socket.close();                                             //关闭码头
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
